package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScanFace: ImageVector
    get() {
        if (_scanFace != null) {
            return _scanFace!!
        }
        _scanFace = ImageVector.Builder(
            name = "ScanFace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.49219f, 13f)
            curveTo(9.29029f, 14.2144f, 10.561f, 15f, 11.9922f, 15f)
            curveTo(13.4234f, 15f, 14.6941f, 14.2144f, 15.4922f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.11719f, 9f)
            horizontalLineTo(8.99219f)
            moveTo(9.24219f, 9f)
            curveTo(9.24219f, 9.13807f, 9.13026f, 9.25f, 8.99219f, 9.25f)
            curveTo(8.85412f, 9.25f, 8.74219f, 9.13807f, 8.74219f, 9f)
            curveTo(8.74219f, 8.86193f, 8.85412f, 8.75f, 8.99219f, 8.75f)
            curveTo(9.13026f, 8.75f, 9.24219f, 8.86193f, 9.24219f, 9f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.1172f, 9f)
            horizontalLineTo(14.9922f)
            moveTo(15.2422f, 9f)
            curveTo(15.2422f, 9.13807f, 15.1303f, 9.25f, 14.9922f, 9.25f)
            curveTo(14.8541f, 9.25f, 14.7422f, 9.13807f, 14.7422f, 9f)
            curveTo(14.7422f, 8.86193f, 14.8541f, 8.75f, 14.9922f, 8.75f)
            curveTo(15.1303f, 8.75f, 15.2422f, 8.86193f, 15.2422f, 9f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.9922f, 21.5f)
            curveTo(16.8545f, 21.5f, 17.7857f, 21.5f, 18.5313f, 21.2286f)
            curveTo(19.7812f, 20.7737f, 20.7659f, 19.789f, 21.2208f, 18.5391f)
            curveTo(21.4922f, 17.7935f, 21.4922f, 16.8623f, 21.4922f, 15f)
            moveTo(8.99219f, 21.5f)
            curveTo(7.12987f, 21.5f, 6.19872f, 21.5f, 5.4531f, 21.2286f)
            curveTo(4.20315f, 20.7737f, 3.21851f, 19.789f, 2.76357f, 18.5391f)
            curveTo(2.49219f, 17.7935f, 2.49219f, 16.8623f, 2.49219f, 15f)
            moveTo(8.99219f, 2.5f)
            curveTo(7.12987f, 2.5f, 6.19872f, 2.5f, 5.4531f, 2.77138f)
            curveTo(4.20315f, 3.22633f, 3.21851f, 4.21096f, 2.76357f, 5.46091f)
            curveTo(2.49219f, 6.20653f, 2.49219f, 7.13769f, 2.49219f, 9f)
            moveTo(14.9922f, 2.5f)
            curveTo(16.8545f, 2.5f, 17.7857f, 2.5f, 18.5313f, 2.77138f)
            curveTo(19.7812f, 3.22633f, 20.7659f, 4.21096f, 21.2208f, 5.46091f)
            curveTo(21.4922f, 6.20653f, 21.4922f, 7.13769f, 21.4922f, 9f)
        }
        }.build()

        return _scanFace!!
    }

private var _scanFace: ImageVector? = null

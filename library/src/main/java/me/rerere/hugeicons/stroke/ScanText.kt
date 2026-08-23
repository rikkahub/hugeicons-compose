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

val HugeIcons.ScanText: ImageVector
    get() {
        if (_scanText != null) {
            return _scanText!!
        }
        _scanText = ImageVector.Builder(
            name = "ScanText",
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
            moveTo(6.99219f, 7f)
            lineTo(13.9922f, 7f)
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
            moveTo(6.99219f, 12f)
            lineTo(16.9922f, 12f)
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
            moveTo(6.99219f, 17f)
            lineTo(11.9922f, 17f)
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

        return _scanText!!
    }

private var _scanText: ImageVector? = null

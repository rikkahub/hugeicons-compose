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

val HugeIcons.PackageCheck: ImageVector
    get() {
        if (_packageCheck != null) {
            return _packageCheck!!
        }
        _packageCheck = ImageVector.Builder(
            name = "PackageCheck",
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
            moveTo(20.4922f, 7f)
            verticalLineTo(12f)
            moveTo(2.49219f, 7f)
            curveTo(2.49219f, 10.0645f, 2.49219f, 16.7742f, 2.49219f, 17.1613f)
            curveTo(2.49219f, 18.5438f, 4.43783f, 19.3657f, 8.32911f, 21.0095f)
            curveTo(9.89238f, 21.6698f, 10.674f, 22f, 11.4922f, 22f)
            lineTo(11.4922f, 11.3548f)
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
            moveTo(7.81811f, 9.69138f)
            lineTo(4.8969f, 8.27785f)
            curveTo(3.29376f, 7.5021f, 2.49219f, 7.11423f, 2.49219f, 6.5f)
            curveTo(2.49219f, 5.88577f, 3.29376f, 5.4979f, 4.8969f, 4.72215f)
            lineTo(7.81811f, 3.30862f)
            curveTo(9.62102f, 2.43621f, 10.5225f, 2f, 11.4922f, 2f)
            curveTo(12.4619f, 2f, 13.3634f, 2.4362f, 15.1663f, 3.30862f)
            lineTo(18.0875f, 4.72215f)
            curveTo(19.6906f, 5.4979f, 20.4922f, 5.88577f, 20.4922f, 6.5f)
            curveTo(20.4922f, 7.11423f, 19.6906f, 7.5021f, 18.0875f, 8.27785f)
            lineTo(15.1663f, 9.69138f)
            curveTo(13.3634f, 10.5638f, 12.4619f, 11f, 11.4922f, 11f)
            curveTo(10.5225f, 11f, 9.62102f, 10.5638f, 7.81811f, 9.69138f)
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
            moveTo(5.49219f, 12f)
            lineTo(7.49219f, 13f)
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
            moveTo(16.4922f, 4f)
            lineTo(6.49219f, 9f)
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
            moveTo(14.4922f, 19f)
            curveTo(14.4922f, 19f, 15.3672f, 19f, 16.2422f, 21f)
            curveTo(16.2422f, 21f, 19.0216f, 16f, 21.4922f, 15f)
        }
        }.build()

        return _packageCheck!!
    }

private var _packageCheck: ImageVector? = null

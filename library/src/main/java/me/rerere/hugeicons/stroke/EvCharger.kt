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

val HugeIcons.EvCharger: ImageVector
    get() {
        if (_evCharger != null) {
            return _evCharger!!
        }
        _evCharger = ImageVector.Builder(
            name = "EvCharger",
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
            moveTo(2.75f, 21f)
            horizontalLineTo(15.75f)
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
            moveTo(15f, 21f)
            verticalLineTo(8.5f)
            curveTo(15f, 6.15442f, 15f, 4.98164f, 14.3801f, 4.17372f)
            curveTo(14.2205f, 3.96572f, 14.0343f, 3.77954f, 13.8263f, 3.61994f)
            curveTo(13.0184f, 3f, 11.8456f, 3f, 9.5f, 3f)
            curveTo(7.15442f, 3f, 5.98164f, 3f, 5.17372f, 3.61994f)
            curveTo(4.96572f, 3.77954f, 4.77954f, 3.96572f, 4.61994f, 4.17372f)
            curveTo(4f, 4.98164f, 4f, 6.15442f, 4f, 8.5f)
            verticalLineTo(21f)
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
            moveTo(9.25f, 7f)
            lineTo(8.29498f, 8.91459f)
            curveTo(8.05232f, 9.40106f, 7.93099f, 9.6443f, 8.04065f, 9.82215f)
            curveTo(8.15031f, 10f, 8.42161f, 10f, 8.96421f, 10f)
            horizontalLineTo(9.53579f)
            curveTo(10.0784f, 10f, 10.3497f, 10f, 10.4594f, 10.1779f)
            curveTo(10.569f, 10.3557f, 10.4477f, 10.5989f, 10.205f, 11.0854f)
            lineTo(9.25f, 13f)
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
            moveTo(17.75f, 5f)
            curveTo(18.2144f, 5f, 18.4466f, 5f, 18.6416f, 5.02567f)
            curveTo(19.9878f, 5.2029f, 21.0471f, 6.26222f, 21.2243f, 7.60842f)
            curveTo(21.25f, 7.80337f, 21.25f, 8.03558f, 21.25f, 8.5f)
            verticalLineTo(17.25f)
            curveTo(21.25f, 18.2165f, 20.4665f, 19f, 19.5f, 19f)
            curveTo(18.5335f, 19f, 17.75f, 18.2165f, 17.75f, 17.25f)
            verticalLineTo(15.75f)
            curveTo(17.75f, 15.0522f, 17.75f, 14.7033f, 17.6639f, 14.4194f)
            curveTo(17.47f, 13.7802f, 16.9698f, 13.28f, 16.3306f, 13.0861f)
            curveTo(16.0467f, 13f, 15.6978f, 13f, 15f, 13f)
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
            moveTo(7.5f, 17f)
            horizontalLineTo(11.5f)
        }
        }.build()

        return _evCharger!!
    }

private var _evCharger: ImageVector? = null

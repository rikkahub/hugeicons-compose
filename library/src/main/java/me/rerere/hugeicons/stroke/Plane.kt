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

val HugeIcons.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = ImageVector.Builder(
            name = "Plane",
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
            moveTo(10.637f, 16.8238f)
            lineTo(20.3868f, 7.07406f)
            curveTo(20.7794f, 6.68143f, 21f, 6.1489f, 21f, 5.59363f)
            curveTo(21f, 4.43735f, 20.0626f, 3.5f, 18.9064f, 3.5f)
            curveTo(18.3511f, 3.5f, 17.8186f, 3.72058f, 17.4259f, 4.11321f)
            lineTo(7.67619f, 13.863f)
            horizontalLineTo(5.63905f)
            curveTo(5.2648f, 13.863f, 5.07768f, 13.863f, 4.89646f, 13.8971f)
            curveTo(4.7879f, 13.9176f, 4.68124f, 13.9471f, 4.57761f, 13.9854f)
            curveTo(4.40465f, 14.0494f, 4.24419f, 14.1457f, 3.92328f, 14.3382f)
            curveTo(3.34739f, 14.6837f, 3.05945f, 14.8565f, 3.01249f, 15.0613f)
            curveTo(2.98553f, 15.1788f, 3.00255f, 15.3021f, 3.06032f, 15.408f)
            curveTo(3.16096f, 15.5924f, 3.48493f, 15.6807f, 4.13286f, 15.8574f)
            lineTo(7.67619f, 16.8238f)
            lineTo(8.64256f, 20.3671f)
            curveTo(8.81926f, 21.0151f, 8.90762f, 21.339f, 9.09202f, 21.4397f)
            curveTo(9.19787f, 21.4975f, 9.3212f, 21.5145f, 9.43874f, 21.4875f)
            curveTo(9.6435f, 21.4406f, 9.81626f, 21.1526f, 10.1618f, 20.5767f)
            curveTo(10.3543f, 20.2558f, 10.4506f, 20.0954f, 10.5146f, 19.9224f)
            curveTo(10.5529f, 19.8188f, 10.5824f, 19.7121f, 10.6029f, 19.6035f)
            curveTo(10.637f, 19.4223f, 10.637f, 19.2352f, 10.637f, 18.861f)
            verticalLineTo(16.8238f)
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
            moveTo(17.5f, 10f)
            verticalLineTo(17.9457f)
            curveTo(17.5f, 18.6356f, 17.3125f, 19.3125f, 16.9575f, 19.9041f)
            curveTo(16.5581f, 20.5698f, 15.5727f, 20.5029f, 15.2669f, 19.7893f)
            lineTo(13f, 14.5f)
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
            moveTo(14.5f, 7f)
            horizontalLineTo(6.55434f)
            curveTo(5.86444f, 7f, 5.18751f, 7.1875f, 4.59592f, 7.54245f)
            curveTo(3.93025f, 7.94186f, 3.99713f, 8.92734f, 4.71066f, 9.23314f)
            lineTo(10f, 11.5f)
        }
        }.build()

        return _plane!!
    }

private var _plane: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsUpRectangle: ImageVector
    get() {
        if (_thumbsUpRectangle != null) {
            return _thumbsUpRectangle!!
        }
        _thumbsUpRectangle = ImageVector.Builder(
            name = "ThumbsUpRectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6525f, 9.2864f)
        lineTo(12.475f, 9.84293f)
        curveTo(12.3295f, 10.299f, 12.2567f, 10.527f, 12.3127f, 10.707f)
        curveTo(12.3579f, 10.8527f, 12.4573f, 10.9783f, 12.5927f, 11.0609f)
        curveTo(12.76f, 11.1631f, 13.0131f, 11.1631f, 13.5194f, 11.1631f)
        horizontalLineTo(13.7887f)
        curveTo(15.5021f, 11.1631f, 16.3588f, 11.1631f, 16.7634f, 11.6553f)
        curveTo(16.8097f, 11.7116f, 16.8508f, 11.7714f, 16.8864f, 11.8341f)
        curveTo(17.1977f, 12.3832f, 16.8438f, 13.1227f, 16.136f, 14.6019f)
        curveTo(15.4865f, 15.9593f, 15.1617f, 16.638f, 14.5587f, 17.0375f)
        curveTo(14.5003f, 17.0761f, 14.4403f, 17.1126f, 14.3789f, 17.1468f)
        curveTo(13.744f, 17.5f, 12.9574f, 17.5f, 11.3843f, 17.5f)
        horizontalLineTo(11.0431f)
        curveTo(9.13715f, 17.5f, 8.18419f, 17.5f, 7.59209f, 16.9432f)
        curveTo(7f, 16.3864f, 7f, 15.4902f, 7f, 13.6978f)
        verticalLineTo(13.0679f)
        curveTo(7f, 12.1259f, 7f, 11.655f, 7.17223f, 11.2239f)
        curveTo(7.34445f, 10.7929f, 7.67424f, 10.4384f, 8.3338f, 9.72954f)
        lineTo(11.0614f, 6.79801f)
        curveTo(11.1298f, 6.72449f, 11.164f, 6.68772f, 11.1942f, 6.66225f)
        curveTo(11.4757f, 6.42448f, 11.9102f, 6.45124f, 12.1563f, 6.72152f)
        curveTo(12.1826f, 6.75047f, 12.2115f, 6.79112f, 12.2691f, 6.87241f)
        curveTo(12.3592f, 6.99956f, 12.4043f, 7.06314f, 12.4436f, 7.12613f)
        curveTo(12.7952f, 7.69003f, 12.9016f, 8.35988f, 12.7405f, 8.9958f)
        curveTo(12.7225f, 9.06683f, 12.6992f, 9.14006f, 12.6525f, 9.2864f)
        }
        }.build()

        return _thumbsUpRectangle!!
    }

private var _thumbsUpRectangle: ImageVector? = null

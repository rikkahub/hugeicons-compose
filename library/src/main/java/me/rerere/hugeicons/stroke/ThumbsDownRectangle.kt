package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsDownRectangle: ImageVector
    get() {
        if (_thumbsDownRectangle != null) {
            return _thumbsDownRectangle!!
        }
        _thumbsDownRectangle = ImageVector.Builder(
            name = "ThumbsDownRectangle",
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
        moveTo(12.6525f, 14.7136f)
        lineTo(12.475f, 14.1571f)
        curveTo(12.3295f, 13.701f, 12.2567f, 13.473f, 12.3127f, 13.293f)
        curveTo(12.3579f, 13.1473f, 12.4573f, 13.0217f, 12.5927f, 12.9391f)
        curveTo(12.76f, 12.8369f, 13.0131f, 12.8369f, 13.5194f, 12.8369f)
        horizontalLineTo(13.7887f)
        curveTo(15.5021f, 12.8369f, 16.3588f, 12.8369f, 16.7634f, 12.3447f)
        curveTo(16.8097f, 12.2884f, 16.8508f, 12.2286f, 16.8864f, 12.1659f)
        curveTo(17.1977f, 11.6168f, 16.8438f, 10.8773f, 16.136f, 9.39811f)
        curveTo(15.4865f, 8.04072f, 15.1617f, 7.36203f, 14.5587f, 6.96255f)
        curveTo(14.5003f, 6.92387f, 14.4403f, 6.8874f, 14.3789f, 6.8532f)
        curveTo(13.744f, 6.5f, 12.9574f, 6.5f, 11.3843f, 6.5f)
        horizontalLineTo(11.0431f)
        curveTo(9.13715f, 6.5f, 8.18419f, 6.5f, 7.59209f, 7.05681f)
        curveTo(7f, 7.61363f, 7f, 8.50981f, 7f, 10.3022f)
        verticalLineTo(10.9321f)
        curveTo(7f, 11.8741f, 7f, 12.345f, 7.17223f, 12.7761f)
        curveTo(7.34445f, 13.2071f, 7.67424f, 13.5616f, 8.3338f, 14.2705f)
        lineTo(11.0614f, 17.202f)
        curveTo(11.1298f, 17.2755f, 11.164f, 17.3123f, 11.1942f, 17.3377f)
        curveTo(11.4757f, 17.5755f, 11.9102f, 17.5488f, 12.1563f, 17.2785f)
        curveTo(12.1826f, 17.2495f, 12.2115f, 17.2089f, 12.2691f, 17.1276f)
        curveTo(12.3592f, 17.0004f, 12.4043f, 16.9369f, 12.4436f, 16.8739f)
        curveTo(12.7952f, 16.31f, 12.9016f, 15.6401f, 12.7405f, 15.0042f)
        curveTo(12.7225f, 14.9332f, 12.6992f, 14.8599f, 12.6525f, 14.7136f)
        }
        }.build()

        return _thumbsDownRectangle!!
    }

private var _thumbsDownRectangle: ImageVector? = null

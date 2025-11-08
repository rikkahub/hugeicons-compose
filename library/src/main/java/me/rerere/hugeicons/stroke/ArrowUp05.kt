package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUp05: ImageVector
    get() {
        if (_arrowUp05 != null) {
            return _arrowUp05!!
        }
        _arrowUp05 = ImageVector.Builder(
            name = "ArrowUp05",
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
        moveTo(6.00108f, 4.0127f)
        lineTo(17.9986f, 4.01272f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9957f, 12.5105f)
        lineTo(12.3663f, 12.5081f)
        curveTo(15.3383f, 12.5289f, 16.3698f, 12.3871f, 15.8822f, 11.1398f)
        lineTo(15.6982f, 10.833f)
        lineTo(15.5237f, 10.5855f)
        lineTo(15.1071f, 10.0531f)
        lineTo(14.2309f, 9.05859f)
        lineTo(13.3602f, 8.04151f)
        lineTo(12.9037f, 7.54456f)
        lineTo(12.6756f, 7.32342f)
        lineTo(12.2948f, 7.06379f)
        lineTo(11.9581f, 7.01221f)
        lineTo(11.6243f, 7.06825f)
        lineTo(11.2469f, 7.33292f)
        lineTo(11.0218f, 7.55707f)
        lineTo(10.5719f, 8.06005f)
        lineTo(9.71483f, 9.08861f)
        lineTo(8.85198f, 10.0947f)
        lineTo(8.44248f, 10.6326f)
        lineTo(8.27132f, 10.8824f)
        lineTo(8.09141f, 11.1916f)
        curveTo(7.62041f, 12.4453f, 8.65374f, 12.5733f, 11.6252f, 12.513f)
        lineTo(11.9957f, 12.5105f)
        moveTo(11.9957f, 12.5105f)
        lineTo(12.0456f, 20.013f)
        }
        }.build()

        return _arrowUp05!!
    }

private var _arrowUp05: ImageVector? = null

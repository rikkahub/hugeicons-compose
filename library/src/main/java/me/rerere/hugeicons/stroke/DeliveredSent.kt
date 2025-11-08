package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeliveredSent: ImageVector
    get() {
        if (_deliveredSent != null) {
            return _deliveredSent!!
        }
        _deliveredSent = ImageVector.Builder(
            name = "DeliveredSent",
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
        moveTo(2f, 9.00012f)
        verticalLineTo(13.9471f)
        curveTo(2f, 16.3291f, 2f, 17.5201f, 2.73223f, 18.2601f)
        curveTo(3.2191f, 18.7522f, 3.90328f, 18.917f, 5f, 18.9723f)
        moveTo(12.4271f, 5.00012f)
        curveTo(13.3404f, 5.30002f, 14.0564f, 6.02366f, 14.3532f, 6.94666f)
        curveTo(14.5f, 7.40334f, 14.5f, 7.96765f, 14.5f, 9.09625f)
        curveTo(14.5f, 9.84865f, 14.5f, 10.2249f, 14.5979f, 10.5293f)
        curveTo(14.7957f, 11.1446f, 15.2731f, 11.6271f, 15.882f, 11.827f)
        curveTo(16.1832f, 11.9259f, 16.5555f, 11.9259f, 17.3f, 11.9259f)
        horizontalLineTo(22f)
        verticalLineTo(13.9471f)
        curveTo(22f, 16.3291f, 22f, 17.5201f, 21.2678f, 18.2601f)
        curveTo(20.7809f, 18.7522f, 20.0967f, 18.917f, 19f, 18.9723f)
        moveTo(9f, 19.0001f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 7.00012f)
        horizontalLineTo(16.3212f)
        curveTo(17.7766f, 7.00012f, 18.5042f, 7.00012f, 19.0964f, 7.35383f)
        curveTo(19.6886f, 7.70754f, 20.0336f, 8.34824f, 20.7236f, 9.62962f)
        lineTo(22f, 12.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.32653f, 8.00012f)
        lineTo(8.81309f, 6.82595f)
        curveTo(9.60436f, 6.20095f, 10f, 5.88845f, 10f, 5.50012f)
        moveTo(7.32653f, 3.00012f)
        lineTo(8.81309f, 4.1743f)
        curveTo(9.60436f, 4.7993f, 10f, 5.1118f, 10f, 5.50012f)
        moveTo(10f, 5.50012f)
        lineTo(2f, 5.50012f)
        }
        }.build()

        return _deliveredSent!!
    }

private var _deliveredSent: ImageVector? = null

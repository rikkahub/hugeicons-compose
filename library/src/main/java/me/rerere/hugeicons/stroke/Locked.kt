package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Locked: ImageVector
    get() {
        if (_locked != null) {
            return _locked!!
        }
        _locked = ImageVector.Builder(
            name = "Locked",
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
        moveTo(2.5f, 8.18689f)
        curveTo(2.60406f, 6.08717f, 2.91537f, 4.77804f, 3.84664f, 3.84676f)
        curveTo(4.77792f, 2.91549f, 6.08705f, 2.60418f, 8.18677f, 2.50012f)
        moveTo(21.5f, 8.18689f)
        curveTo(21.3959f, 6.08717f, 21.0846f, 4.77804f, 20.1534f, 3.84676f)
        curveTo(19.2221f, 2.91549f, 17.9129f, 2.60418f, 15.8132f, 2.50012f)
        moveTo(15.8132f, 21.5001f)
        curveTo(17.9129f, 21.396f, 19.2221f, 21.0847f, 20.1534f, 20.1535f)
        curveTo(21.0846f, 19.2222f, 21.3959f, 17.913f, 21.5f, 15.8133f)
        moveTo(8.18676f, 21.5001f)
        curveTo(6.08705f, 21.396f, 4.77792f, 21.0847f, 3.84664f, 20.1535f)
        curveTo(2.91537f, 19.2222f, 2.60406f, 17.913f, 2.5f, 15.8133f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 10.5545f)
        curveTo(9.5f, 9.7128f, 9.36781f, 8.41337f, 9.87602f, 7.65569f)
        curveTo(10.9985f, 5.98217f, 13.38f, 6.20448f, 14.22f, 7.83797f)
        curveTo(14.6323f, 8.63969f, 14.4769f, 9.76055f, 14.496f, 10.5545f)
        moveTo(9.5f, 10.5545f)
        curveTo(8.20267f, 10.5545f, 7.93843f, 11.2972f, 7.74002f, 11.8797f)
        curveTo(7.55687f, 12.535f, 7.37042f, 14.0997f, 7.65602f, 15.8142f)
        curveTo(7.86969f, 16.9064f, 8.70479f, 17.3868f, 9.42297f, 17.4477f)
        curveTo(10.1098f, 17.5059f, 13.0097f, 17.4837f, 13.8492f, 17.4837f)
        curveTo(15.1501f, 17.4837f, 15.9624f, 17.1977f, 16.344f, 15.887f)
        curveTo(16.5272f, 14.8676f, 16.5773f, 13.0447f, 16.272f, 11.8797f)
        curveTo(15.8676f, 10.7146f, 15.0523f, 10.5545f, 14.496f, 10.5545f)
        moveTo(9.5f, 10.5545f)
        curveTo(10.8736f, 10.5f, 13.7107f, 10.5108f, 14.496f, 10.5545f)
        }
        }.build()

        return _locked!!
    }

private var _locked: ImageVector? = null

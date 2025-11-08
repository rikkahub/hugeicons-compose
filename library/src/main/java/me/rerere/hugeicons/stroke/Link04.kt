package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link04: ImageVector
    get() {
        if (_link04 != null) {
            return _link04!!
        }
        _link04 = ImageVector.Builder(
            name = "Link04",
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
        moveTo(10f, 13.229f)
        curveTo(10.1416f, 13.4609f, 10.3097f, 13.6804f, 10.5042f, 13.8828f)
        curveTo(11.7117f, 15.1395f, 13.5522f, 15.336f, 14.9576f, 14.4722f)
        curveTo(15.218f, 14.3121f, 15.4634f, 14.1157f, 15.6872f, 13.8828f)
        lineTo(18.9266f, 10.5114f)
        curveTo(20.3578f, 9.02184f, 20.3578f, 6.60676f, 18.9266f, 5.11718f)
        curveTo(17.4953f, 3.6276f, 15.1748f, 3.62761f, 13.7435f, 5.11718f)
        lineTo(13.03f, 5.85978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9703f, 18.14f)
        lineTo(10.2565f, 18.8828f)
        curveTo(8.82526f, 20.3724f, 6.50471f, 20.3724f, 5.07345f, 18.8828f)
        curveTo(3.64218f, 17.3932f, 3.64218f, 14.9782f, 5.07345f, 13.4886f)
        lineTo(8.31287f, 10.1172f)
        curveTo(9.74413f, 8.62761f, 12.0647f, 8.6276f, 13.4959f, 10.1172f)
        curveTo(13.6904f, 10.3195f, 13.8584f, 10.539f, 14f, 10.7708f)
        }
        }.build()

        return _link04!!
    }

private var _link04: ImageVector? = null

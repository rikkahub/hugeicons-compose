package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailBlock02: ImageVector
    get() {
        if (_mailBlock02 != null) {
            return _mailBlock02!!
        }
        _mailBlock02 = ImageVector.Builder(
            name = "MailBlock02",
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
        moveTo(21.9982f, 11.5f)
        curveTo(22.003f, 10.8417f, 21.9983f, 10.6844f, 21.9842f, 10.0244f)
        curveTo(21.9189f, 6.95886f, 21.8862f, 5.42609f, 20.7551f, 4.29066f)
        curveTo(19.6239f, 3.15523f, 18.0497f, 3.11568f, 14.9012f, 3.03657f)
        curveTo(12.9607f, 2.98781f, 11.0393f, 2.98781f, 9.09882f, 3.03656f)
        curveTo(5.95033f, 3.11566f, 4.37608f, 3.15521f, 3.24495f, 4.29065f)
        curveTo(2.11382f, 5.42608f, 2.08114f, 6.95885f, 2.01576f, 10.0244f)
        curveTo(1.99474f, 11.0101f, 1.99475f, 11.9899f, 2.01577f, 12.9756f)
        curveTo(2.08114f, 16.0412f, 2.11383f, 17.5739f, 3.24496f, 18.7094f)
        curveTo(4.37608f, 19.8448f, 5.95033f, 19.8843f, 9.09883f, 19.9634f)
        curveTo(10.404f, 19.9962f, 11.2005f, 20.007f, 12.5f, 19.9957f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        lineTo(9.94202f, 9.73943f)
        curveTo(11.6572f, 10.7535f, 12.3428f, 10.7535f, 14.058f, 9.73943f)
        lineTo(17f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0505f, 15f)
        curveTo(15.4022f, 15.6353f, 15f, 16.5207f, 15f, 17.5f)
        curveTo(15f, 19.433f, 16.567f, 21f, 18.5f, 21f)
        curveTo(19.4793f, 21f, 20.3647f, 20.5978f, 21f, 19.9495f)
        moveTo(16.0505f, 15f)
        curveTo(16.6818f, 14.3814f, 17.5463f, 14f, 18.5f, 14f)
        curveTo(20.433f, 14f, 22f, 15.567f, 22f, 17.5f)
        curveTo(22f, 18.4537f, 21.6186f, 19.3182f, 21f, 19.9495f)
        moveTo(16.0505f, 15f)
        lineTo(21f, 19.9495f)
        }
        }.build()

        return _mailBlock02!!
    }

private var _mailBlock02: ImageVector? = null

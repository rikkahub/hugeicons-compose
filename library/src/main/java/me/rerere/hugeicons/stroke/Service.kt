package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Service: ImageVector
    get() {
        if (_service != null) {
            return _service!!
        }
        _service = ImageVector.Builder(
            name = "Service",
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
        moveTo(19.4173f, 15.7133f)
        curveTo(23.368f, 10.7038f, 22.3007f, 5.73508f, 19.4626f, 3.99415f)
        curveTo(16.7809f, 2.34923f, 14.4404f, 3.01211f, 13.0344f, 4.06801f)
        lineTo(11.9998f, 4.84158f)
        moveTo(19.4173f, 15.7133f)
        curveTo(18.469f, 16.9156f, 17.2317f, 18.1204f, 15.6605f, 19.2834f)
        curveTo(14.1143f, 20.4278f, 13.3412f, 21f, 12f, 21f)
        curveTo(10.6588f, 21f, 9.88572f, 20.4278f, 8.33953f, 19.2834f)
        curveTo(0.22172f, 13.2749f, 1.01807f, 6.15293f, 4.53744f, 3.99415f)
        curveTo(7.21909f, 2.34923f, 9.55962f, 3.01211f, 10.9656f, 4.06801f)
        lineTo(11.9998f, 4.84158f)
        moveTo(19.4173f, 15.7133f)
        lineTo(13.8921f, 9.44479f)
        curveTo(13.6659f, 9.1882f, 13.2873f, 9.13296f, 12.9972f, 9.31424f)
        lineTo(10.8111f, 10.6806f)
        curveTo(10.0418f, 11.1614f, 9.04334f, 11.0532f, 8.3949f, 10.4187f)
        curveTo(7.53837f, 9.58062f, 7.62479f, 8.17769f, 8.5777f, 7.45106f)
        lineTo(11.9998f, 4.84158f)
        }
        }.build()

        return _service!!
    }

private var _service: ImageVector? = null

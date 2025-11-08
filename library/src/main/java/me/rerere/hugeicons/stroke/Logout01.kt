package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Logout01: ImageVector
    get() {
        if (_logout01 != null) {
            return _logout01!!
        }
        _logout01 = ImageVector.Builder(
            name = "Logout01",
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
        moveTo(15.5f, 8.04045f)
        curveTo(15.4588f, 6.87972f, 15.3216f, 6.15451f, 14.8645f, 5.58671f)
        curveTo(14.2114f, 4.77536f, 13.0944f, 4.52064f, 10.8605f, 4.01121f)
        lineTo(9.85915f, 3.78286f)
        curveTo(6.4649f, 3.00882f, 4.76777f, 2.6218f, 3.63388f, 3.51317f)
        curveTo(2.5f, 4.40454f, 2.5f, 6.1257f, 2.5f, 9.56803f)
        verticalLineTo(14.432f)
        curveTo(2.5f, 17.8743f, 2.5f, 19.5955f, 3.63388f, 20.4868f)
        curveTo(4.76777f, 21.3782f, 6.4649f, 20.9912f, 9.85915f, 20.2171f)
        lineTo(10.8605f, 19.9888f)
        curveTo(13.0944f, 19.4794f, 14.2114f, 19.2246f, 14.8645f, 18.4133f)
        curveTo(15.3216f, 17.8455f, 15.4588f, 17.1203f, 15.5f, 15.9595f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 9.01172f)
        curveTo(18.5f, 9.01172f, 21.5f, 11.2212f, 21.5f, 12.0117f)
        curveTo(21.5f, 12.8023f, 18.5f, 15.0117f, 18.5f, 15.0117f)
        moveTo(21f, 12.0117f)
        horizontalLineTo(8.49998f)
        }
        }.build()

        return _logout01!!
    }

private var _logout01: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mortar: ImageVector
    get() {
        if (_mortar != null) {
            return _mortar!!
        }
        _mortar = ImageVector.Builder(
            name = "Mortar",
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
        moveTo(4.96256f, 12f)
        horizontalLineTo(19.0374f)
        curveTo(20.0144f, 12f, 20.5028f, 12f, 20.8047f, 12.3753f)
        curveTo(21.1065f, 12.7506f, 21.0135f, 13.1617f, 20.8276f, 13.984f)
        curveTo(20.2864f, 16.3763f, 18.7876f, 18.408f, 16.7527f, 19.6599f)
        curveTo(16.3614f, 19.9006f, 16.1944f, 20.3975f, 16.4056f, 20.8042f)
        curveTo(16.689f, 21.3497f, 16.2909f, 22f, 15.6735f, 22f)
        horizontalLineTo(8.32647f)
        curveTo(7.70915f, 22f, 7.31104f, 21.3497f, 7.5944f, 20.8042f)
        curveTo(7.80561f, 20.3975f, 7.63863f, 19.9006f, 7.24729f, 19.6599f)
        curveTo(5.21237f, 18.408f, 3.71356f, 16.3763f, 3.17245f, 13.984f)
        curveTo(2.98645f, 13.1617f, 2.89345f, 12.7506f, 3.1953f, 12.3753f)
        curveTo(3.49715f, 12f, 3.98562f, 12f, 4.96256f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4588f, 12f)
        lineTo(19.0095f, 8.28104f)
        curveTo(19.1841f, 7.86217f, 19.6148f, 7.65205f, 20.047f, 7.57994f)
        curveTo(20.4208f, 7.51758f, 20.7187f, 7.3415f, 20.8785f, 7.05278f)
        curveTo(21.2753f, 6.33534f, 20.6683f, 5.1941f, 19.5226f, 4.50374f)
        curveTo(18.3769f, 3.81338f, 17.1264f, 3.83534f, 16.7295f, 4.55278f)
        curveTo(16.5698f, 4.8415f, 16.5726f, 5.19885f, 16.7078f, 5.56783f)
        curveTo(16.864f, 5.99454f, 16.905f, 6.48886f, 16.6448f, 6.85615f)
        lineTo(13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.50185f, 5.50185f)
        lineTo(10f, 9f)
        moveTo(8.60074f, 3.40297f)
        curveTo(10.1463f, 4.94854f, 9.75993f, 6.44156f, 8.60074f, 7.60074f)
        curveTo(7.44156f, 8.75993f, 5.94854f, 9.14632f, 4.40297f, 7.60074f)
        curveTo(2.85739f, 6.05516f, 3.00371f, 2.00371f, 3.00371f, 2.00371f)
        curveTo(3.00371f, 2.00371f, 7.05516f, 1.85739f, 8.60074f, 3.40297f)
        }
        }.build()

        return _mortar!!
    }

private var _mortar: ImageVector? = null

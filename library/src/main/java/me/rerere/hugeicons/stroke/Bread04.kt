package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bread04: ImageVector
    get() {
        if (_bread04 != null) {
            return _bread04!!
        }
        _bread04 = ImageVector.Builder(
            name = "Bread04",
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
        moveTo(8.5f, 4f)
        curveTo(5.04311f, 4f, 2f, 5.59321f, 2f, 7.55853f)
        curveTo(2f, 8.92302f, 3.6427f, 9.93848f, 3.43338f, 11.2206f)
        lineTo(3.18919f, 15.7778f)
        curveTo(3.08307f, 17.7584f, 3.03001f, 18.7487f, 3.59988f, 19.3744f)
        curveTo(4.16975f, 20f, 5.12486f, 20f, 7.0351f, 20f)
        horizontalLineTo(9.9649f)
        curveTo(11.8751f, 20f, 12.8303f, 20f, 13.4001f, 19.3744f)
        curveTo(13.97f, 18.7487f, 13.9169f, 17.7584f, 13.8108f, 15.7778f)
        lineTo(13.5666f, 11.2206f)
        curveTo(13.3573f, 9.93848f, 15f, 8.92302f, 15f, 7.55853f)
        curveTo(15f, 5.59321f, 11.9569f, 4f, 8.5f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 20f)
        horizontalLineTo(17.1838f)
        curveTo(19.011f, 20f, 19.9246f, 20f, 20.4697f, 19.3744f)
        curveTo(21.0148f, 18.7487f, 20.964f, 17.7584f, 20.8625f, 15.7778f)
        lineTo(20.629f, 11.2206f)
        curveTo(20.4287f, 9.93848f, 22f, 8.92302f, 22f, 7.55853f)
        curveTo(22f, 5.59321f, 19.0892f, 4f, 15.7826f, 4f)
        horizontalLineTo(8f)
        }
        }.build()

        return _bread04!!
    }

private var _bread04: ImageVector? = null

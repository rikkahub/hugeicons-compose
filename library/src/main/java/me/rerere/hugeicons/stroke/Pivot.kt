package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pivot: ImageVector
    get() {
        if (_pivot != null) {
            return _pivot!!
        }
        _pivot = ImageVector.Builder(
            name = "Pivot",
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
        moveTo(21.5f, 11.5f)
        curveTo(21.5f, 7.27027f, 21.5f, 5.1554f, 20.302f, 3.75276f)
        curveTo(20.1319f, 3.55358f, 19.9464f, 3.36808f, 19.7472f, 3.19797f)
        curveTo(18.3446f, 2f, 16.2297f, 2f, 12f, 2f)
        curveTo(7.77027f, 2f, 5.6554f, 2f, 4.25276f, 3.19797f)
        curveTo(4.05358f, 3.36808f, 3.86808f, 3.55358f, 3.69797f, 3.75276f)
        curveTo(2.5f, 5.1554f, 2.5f, 7.27027f, 2.5f, 11.5f)
        curveTo(2.5f, 15.7297f, 2.5f, 17.8446f, 3.69797f, 19.2472f)
        curveTo(3.86808f, 19.4464f, 4.05358f, 19.6319f, 4.25276f, 19.802f)
        curveTo(5.54022f, 20.9016f, 7.42774f, 20.9919f, 11f, 20.9993f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 2.5f)
        lineTo(8.5f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 8f)
        lineTo(3f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 17f)
        curveTo(15.9943f, 17.4915f, 14f, 18.7998f, 14f, 19.5f)
        curveTo(14f, 20.2002f, 15.9943f, 21.5085f, 16.5f, 22f)
        moveTo(14.5f, 19.5f)
        horizontalLineTo(16.5f)
        curveTo(18.3692f, 19.5f, 19.3038f, 19.5f, 20f, 19.0981f)
        curveTo(20.4561f, 18.8348f, 20.8348f, 18.4561f, 21.0981f, 18f)
        curveTo(21.5f, 17.3038f, 21.5f, 16.3692f, 21.5f, 14.5f)
        }
        }.build()

        return _pivot!!
    }

private var _pivot: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) {
            return _washingMachine!!
        }
        _washingMachine = ImageVector.Builder(
            name = "WashingMachine",
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
        moveTo(3f, 14f)
        verticalLineTo(10f)
        curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
        curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
        curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
        verticalLineTo(14f)
        curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
        curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
        curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        verticalLineTo(6.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 13f)
        curveTo(17f, 15.7614f, 14.7614f, 18f, 12f, 18f)
        curveTo(9.23858f, 18f, 7f, 15.7614f, 7f, 13f)
        curveTo(7f, 10.2386f, 9.23858f, 8f, 12f, 8f)
        curveTo(14.7614f, 8f, 17f, 10.2386f, 17f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13f)
        curveTo(8.66667f, 11.6667f, 10.3333f, 11.6667f, 12f, 13f)
        curveTo(13.6667f, 14.3333f, 15.3333f, 14.3333f, 17f, 13f)
        }
        }.build()

        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null

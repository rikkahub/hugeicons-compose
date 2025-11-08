package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Alien01: ImageVector
    get() {
        if (_alien01 != null) {
            return _alien01!!
        }
        _alien01 = ImageVector.Builder(
            name = "Alien01",
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
        moveTo(7.33333f, 10f)
        horizontalLineTo(6.5f)
        curveTo(6.22386f, 10f, 6f, 10.2239f, 6f, 10.5f)
        verticalLineTo(11.3333f)
        curveTo(6f, 12.8061f, 7.19391f, 14f, 8.66667f, 14f)
        horizontalLineTo(9.5f)
        curveTo(9.77614f, 14f, 10f, 13.7761f, 10f, 13.5f)
        verticalLineTo(12.6667f)
        curveTo(10f, 11.1939f, 8.80609f, 10f, 7.33333f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.6667f, 10f)
        horizontalLineTo(17f)
        curveTo(17.4714f, 10f, 17.7071f, 10f, 17.8536f, 10.1464f)
        curveTo(18f, 10.2929f, 18f, 10.5286f, 18f, 11f)
        verticalLineTo(11.3333f)
        curveTo(18f, 12.8061f, 16.8061f, 14f, 15.3333f, 14f)
        horizontalLineTo(15f)
        curveTo(14.5286f, 14f, 14.2929f, 14f, 14.1464f, 13.8536f)
        curveTo(14f, 13.7071f, 14f, 13.4714f, 14f, 13f)
        verticalLineTo(12.6667f)
        curveTo(14f, 11.1939f, 15.1939f, 10f, 16.6667f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11f)
        curveTo(21f, 16.5228f, 15f, 22f, 12f, 22f)
        curveTo(9f, 22f, 3f, 16.5228f, 3f, 11f)
        curveTo(3f, 5.47715f, 7.02944f, 2f, 12f, 2f)
        curveTo(16.9706f, 2f, 21f, 5.47715f, 21f, 11f)
        }
        }.build()

        return _alien01!!
    }

private var _alien01: ImageVector? = null

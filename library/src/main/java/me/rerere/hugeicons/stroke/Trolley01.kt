package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Trolley01: ImageVector
    get() {
        if (_trolley01 != null) {
            return _trolley01!!
        }
        _trolley01 = ImageVector.Builder(
            name = "Trolley01",
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
        moveTo(2f, 2f)
        horizontalLineTo(3.30116f)
        curveTo(4.48672f, 2f, 5.0795f, 2f, 5.4814f, 2.37142f)
        curveTo(5.88331f, 2.74285f, 5.96165f, 3.36307f, 6.11834f, 4.60351f)
        lineTo(7.24573f, 13.5287f)
        curveTo(7.45464f, 15.1826f, 7.5591f, 16.0095f, 8.09497f, 16.5048f)
        curveTo(8.63085f, 17f, 9.42122f, 17f, 11.002f, 17f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        horizontalLineTo(14f)
        curveTo(13.0572f, 14f, 12.5858f, 14f, 12.2929f, 13.6339f)
        curveTo(12f, 13.2678f, 12f, 12.6785f, 12f, 11.5f)
        curveTo(12f, 10.3215f, 12f, 9.73223f, 12.2929f, 9.36612f)
        curveTo(12.5858f, 9f, 13.0572f, 9f, 14f, 9f)
        horizontalLineTo(20f)
        curveTo(20.9428f, 9f, 21.4142f, 9f, 21.7071f, 9.36612f)
        curveTo(22f, 9.73223f, 22f, 10.3215f, 22f, 11.5f)
        curveTo(22f, 12.6785f, 22f, 13.2678f, 21.7071f, 13.6339f)
        curveTo(21.4142f, 14f, 20.9428f, 14f, 20f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9f)
        horizontalLineTo(12f)
        curveTo(11.0572f, 9f, 10.5858f, 9f, 10.2929f, 8.63388f)
        curveTo(10f, 8.26777f, 10f, 7.67851f, 10f, 6.5f)
        curveTo(10f, 5.32149f, 10f, 4.73223f, 10.2929f, 4.36612f)
        curveTo(10.5858f, 4f, 11.0572f, 4f, 12f, 4f)
        horizontalLineTo(18f)
        curveTo(18.9428f, 4f, 19.4142f, 4f, 19.7071f, 4.36612f)
        curveTo(20f, 4.73223f, 20f, 5.32149f, 20f, 6.5f)
        curveTo(20f, 7.67851f, 20f, 8.26777f, 19.7071f, 8.63388f)
        curveTo(19.4142f, 9f, 18.9428f, 9f, 18f, 9f)
        }
        }.build()

        return _trolley01!!
    }

private var _trolley01: ImageVector? = null

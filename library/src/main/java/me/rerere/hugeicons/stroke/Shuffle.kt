package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = ImageVector.Builder(
            name = "Shuffle",
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
        moveTo(19.5576f, 4f)
        lineTo(20.4551f, 4.97574f)
        curveTo(20.8561f, 5.41165f, 21.0566f, 5.62961f, 20.9861f, 5.81481f)
        curveTo(20.9155f, 6f, 20.632f, 6f, 20.0649f, 6f)
        curveTo(18.7956f, 6f, 17.2771f, 5.79493f, 16.1111f, 6.4733f)
        curveTo(15.3903f, 6.89272f, 14.8883f, 7.62517f, 14.0392f, 9f)
        moveTo(3f, 18f)
        horizontalLineTo(4.58082f)
        curveTo(6.50873f, 18f, 7.47269f, 18f, 8.2862f, 17.5267f)
        curveTo(9.00708f, 17.1073f, 9.50904f, 16.3748f, 10.3582f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5576f, 20f)
        lineTo(20.4551f, 19.0243f)
        curveTo(20.8561f, 18.5883f, 21.0566f, 18.3704f, 20.9861f, 18.1852f)
        curveTo(20.9155f, 18f, 20.632f, 18f, 20.0649f, 18f)
        curveTo(18.7956f, 18f, 17.2771f, 18.2051f, 16.1111f, 17.5267f)
        curveTo(15.2976f, 17.0534f, 14.7629f, 16.1815f, 13.6935f, 14.4376f)
        lineTo(10.7038f, 9.5624f)
        curveTo(9.63441f, 7.81853f, 9.0997f, 6.9466f, 8.2862f, 6.4733f)
        curveTo(7.47269f, 6f, 6.50873f, 6f, 4.58082f, 6f)
        horizontalLineTo(3f)
        }
        }.build()

        return _shuffle!!
    }

private var _shuffle: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tailwindcss: ImageVector
    get() {
        if (_tailwindcss != null) {
            return _tailwindcss!!
        }
        _tailwindcss = ImageVector.Builder(
            name = "Tailwindcss",
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
        moveTo(12f, 6f)
        curveTo(8.4f, 6f, 7.16667f, 8.66667f, 7f, 10f)
        curveTo(7f, 10f, 7.81901f, 8.41169f, 9.86274f, 8.41169f)
        curveTo(12.3627f, 8.41169f, 12.5667f, 12f, 17.0667f, 12f)
        curveTo(20.7116f, 12f, 21.8333f, 9.51702f, 22f, 8.27554f)
        curveTo(22f, 8.27554f, 21.2198f, 9.67872f, 19.2198f, 9.67872f)
        curveTo(16.7296f, 9.67872f, 16.4134f, 6f, 12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        curveTo(3.4f, 12f, 2.16667f, 14.6667f, 2f, 16f)
        curveTo(2f, 16f, 2.81901f, 14.4117f, 4.86274f, 14.4117f)
        curveTo(7.36274f, 14.4117f, 7.56671f, 18f, 12.0667f, 18f)
        curveTo(15.7116f, 18f, 16.8333f, 15.517f, 17f, 14.2755f)
        curveTo(17f, 14.2755f, 16.2198f, 15.6787f, 14.2198f, 15.6787f)
        curveTo(11.7296f, 15.6787f, 11.4134f, 12f, 7f, 12f)
        }
        }.build()

        return _tailwindcss!!
    }

private var _tailwindcss: ImageVector? = null

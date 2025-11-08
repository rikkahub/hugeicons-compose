package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonEclipse: ImageVector
    get() {
        if (_moonEclipse != null) {
            return _moonEclipse!!
        }
        _moonEclipse = ImageVector.Builder(
            name = "MoonEclipse",
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
        moveTo(10f, 2.2002f)
        curveTo(14.5645f, 3.12674f, 18f, 7.16224f, 18f, 12.0002f)
        curveTo(18f, 16.8381f, 14.5645f, 20.8736f, 10f, 21.8001f)
        }
        }.build()

        return _moonEclipse!!
    }

private var _moonEclipse: ImageVector? = null

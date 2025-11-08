package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pacman01: ImageVector
    get() {
        if (_pacman01 != null) {
            return _pacman01!!
        }
        _pacman01 = ImageVector.Builder(
            name = "Pacman01",
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
        moveTo(22f, 12f)
        horizontalLineTo(21.991f)
        moveTo(18.009f, 12f)
        horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5119f, 7.5f)
        lineTo(10.5029f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(2f, 16.9706f, 5.94274f, 21f, 10.8064f, 21f)
        curveTo(13.2733f, 21f, 15.5033f, 19.9634f, 17.102f, 18.2931f)
        curveTo(17.7426f, 17.6238f, 18.0629f, 17.2892f, 17.9897f, 16.7418f)
        curveTo(17.9166f, 16.1945f, 17.4528f, 15.9208f, 16.525f, 15.3735f)
        lineTo(15.7671f, 14.9264f)
        curveTo(13.5637f, 13.6266f, 12.462f, 12.9767f, 12.462f, 12f)
        curveTo(12.462f, 11.0233f, 13.5637f, 10.3734f, 15.7671f, 9.07358f)
        lineTo(16.525f, 8.62647f)
        curveTo(17.4528f, 8.07919f, 17.9166f, 7.80555f, 17.9897f, 7.25817f)
        curveTo(18.0629f, 6.71078f, 17.7426f, 6.37617f, 17.102f, 5.70695f)
        curveTo(15.5033f, 4.03665f, 13.2733f, 3f, 10.8064f, 3f)
        curveTo(5.94274f, 3f, 2f, 7.02944f, 2f, 12f)
        }
        }.build()

        return _pacman01!!
    }

private var _pacman01: ImageVector? = null

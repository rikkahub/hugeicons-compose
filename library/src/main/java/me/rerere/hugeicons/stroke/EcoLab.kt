package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EcoLab: ImageVector
    get() {
        if (_ecoLab != null) {
            return _ecoLab!!
        }
        _ecoLab = ImageVector.Builder(
            name = "EcoLab",
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
        moveTo(12f, 5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        horizontalLineTo(10f)
        curveTo(11.1046f, 2f, 12f, 2.89543f, 12f, 4f)
        verticalLineTo(5f)
        horizontalLineTo(10f)
        curveTo(8.89543f, 5f, 8f, 4.10457f, 8f, 3f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8148f, 22f)
        horizontalLineTo(7.18524f)
        curveTo(6.53065f, 22f, 6f, 21.4693f, 6f, 20.8148f)
        curveTo(6f, 20.6085f, 6.05383f, 20.4058f, 6.15616f, 20.2267f)
        lineTo(10f, 13.5f)
        verticalLineTo(9f)
        horizontalLineTo(14f)
        verticalLineTo(13.5f)
        lineTo(17.8438f, 20.2267f)
        curveTo(17.9462f, 20.4058f, 18f, 20.6085f, 18f, 20.8148f)
        curveTo(18f, 21.4693f, 17.4693f, 22f, 16.8148f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        horizontalLineTo(14f)
        curveTo(12.8954f, 3f, 12f, 3.89543f, 12f, 5f)
        verticalLineTo(6f)
        horizontalLineTo(14f)
        curveTo(15.1046f, 6f, 16f, 5.10457f, 16f, 4f)
        verticalLineTo(3f)
        }
        }.build()

        return _ecoLab!!
    }

private var _ecoLab: ImageVector? = null

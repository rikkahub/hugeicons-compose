package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SaveEnergy02: ImageVector
    get() {
        if (_saveEnergy02 != null) {
            return _saveEnergy02!!
        }
        _saveEnergy02 = ImageVector.Builder(
            name = "SaveEnergy02",
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
        moveTo(12f, 3.5f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.5f)
        curveTo(11.0608f, 3.5f, 7.52791f, 7.29323f, 6.97182f, 12.2037f)
        moveTo(12f, 3.5f)
        curveTo(12.9392f, 3.5f, 16.4721f, 7.29322f, 17.0282f, 12.2037f)
        moveTo(12f, 3.5f)
        curveTo(16.9367f, 3.5f, 21.0545f, 6.93552f, 22f, 11.5f)
        curveTo(20.6123f, 12.7f, 18.1073f, 12.4691f, 17.0282f, 12.2037f)
        moveTo(12f, 3.5f)
        curveTo(7.06333f, 3.5f, 2.94545f, 6.93552f, 2f, 11.5f)
        curveTo(3.38792f, 12.7f, 5.89285f, 12.4691f, 6.97182f, 12.2037f)
        moveTo(6.97182f, 12.2037f)
        curveTo(8.4559f, 13.0288f, 10.1718f, 13.5f, 12f, 13.5f)
        curveTo(13.8282f, 13.5f, 15.5441f, 13.0288f, 17.0282f, 12.2037f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15f)
        lineTo(16f, 18.5f)
        horizontalLineTo(20f)
        lineTo(17.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        verticalLineTo(20.5f)
        curveTo(12f, 21.3284f, 11.3284f, 22f, 10.5f, 22f)
        curveTo(9.67157f, 22f, 9f, 21.3284f, 9f, 20.5f)
        verticalLineTo(20f)
        }
        }.build()

        return _saveEnergy02!!
    }

private var _saveEnergy02: ImageVector? = null

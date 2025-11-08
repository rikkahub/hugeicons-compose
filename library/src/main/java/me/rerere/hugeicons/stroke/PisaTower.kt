package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PisaTower: ImageVector
    get() {
        if (_pisaTower != null) {
            return _pisaTower!!
        }
        _pisaTower = ImageVector.Builder(
            name = "PisaTower",
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
        moveTo(2f, 21f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.4591f, 16.4179f)
        lineTo(17.7484f, 11.3959f)
        moveTo(16.4591f, 16.4179f)
        lineTo(17.4214f, 16.6871f)
        moveTo(16.4591f, 16.4179f)
        lineTo(15.2828f, 21f)
        moveTo(16.4591f, 16.4179f)
        lineTo(7.79815f, 13.9957f)
        moveTo(17.7484f, 11.3959f)
        lineTo(19.0377f, 6.3738f)
        moveTo(17.7484f, 11.3959f)
        lineTo(18.7107f, 11.665f)
        moveTo(17.7484f, 11.3959f)
        lineTo(9.08743f, 8.97368f)
        moveTo(19.0377f, 6.3738f)
        lineTo(17.113f, 5.83554f)
        moveTo(19.0377f, 6.3738f)
        lineTo(20f, 6.64294f)
        moveTo(7.79815f, 13.9957f)
        lineTo(9.08743f, 8.97368f)
        moveTo(7.79815f, 13.9957f)
        lineTo(6.83582f, 13.7266f)
        moveTo(7.79815f, 13.9957f)
        lineTo(6f, 21f)
        moveTo(9.08743f, 8.97368f)
        lineTo(10.3767f, 3.95162f)
        moveTo(9.08743f, 8.97368f)
        lineTo(8.1251f, 8.70455f)
        moveTo(10.3767f, 3.95162f)
        lineTo(9.41437f, 3.68249f)
        moveTo(10.3767f, 3.95162f)
        lineTo(12.3014f, 4.48988f)
        moveTo(12.3014f, 4.48988f)
        lineTo(17.113f, 5.83554f)
        moveTo(12.3014f, 4.48988f)
        lineTo(12.7458f, 2.75811f)
        curveTo(12.8862f, 2.21105f, 13.4418f, 1.88632f, 13.9799f, 2.03682f)
        lineTo(16.8635f, 2.84327f)
        curveTo(17.3901f, 2.99054f, 17.7025f, 3.53846f, 17.5651f, 4.07382f)
        lineTo(17.113f, 5.83554f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 21f)
        lineTo(11.06f, 19f)
        moveTo(14f, 8.5f)
        lineTo(13.5218f, 10.208f)
        moveTo(12.1121f, 15.2424f)
        lineTo(12.5655f, 13.6232f)
        }
        }.build()

        return _pisaTower!!
    }

private var _pisaTower: ImageVector? = null

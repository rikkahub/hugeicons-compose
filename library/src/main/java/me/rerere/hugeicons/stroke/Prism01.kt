package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Prism01: ImageVector
    get() {
        if (_prism01 != null) {
            return _prism01!!
        }
        _prism01 = ImageVector.Builder(
            name = "Prism01",
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
        moveTo(15.5802f, 8f)
        lineTo(14.9874f, 6.85021f)
        curveTo(13.664f, 4.2834f, 13.0023f, 3f, 12f, 3f)
        curveTo(10.9977f, 3f, 10.336f, 4.2834f, 9.01261f, 6.85021f)
        lineTo(4.59051f, 15.4272f)
        curveTo(3.31146f, 17.908f, 2.67193f, 19.1484f, 3.16823f, 20.0742f)
        curveTo(3.66452f, 21f, 4.96898f, 21f, 7.5779f, 21f)
        horizontalLineTo(16.4221f)
        curveTo(19.031f, 21f, 20.3355f, 21f, 20.8318f, 20.0742f)
        curveTo(21.3281f, 19.1484f, 20.6885f, 17.908f, 19.4095f, 15.4272f)
        lineTo(19.0598f, 14.7489f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        lineTo(22f, 7f)
        moveTo(8f, 10f)
        lineTo(21.4615f, 11.5f)
        moveTo(8f, 10f)
        lineTo(22f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        lineTo(2f, 11f)
        }
        }.build()

        return _prism01!!
    }

private var _prism01: ImageVector? = null

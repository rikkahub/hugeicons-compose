package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrangeByLettersAZ: ImageVector
    get() {
        if (_arrangeByLettersAZ != null) {
            return _arrangeByLettersAZ!!
        }
        _arrangeByLettersAZ = ImageVector.Builder(
            name = "ArrangeByLettersAZ",
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
        moveTo(4f, 14f)
        horizontalLineTo(8.42109f)
        curveTo(9.35119f, 14f, 9.81624f, 14f, 9.94012f, 14.2801f)
        curveTo(10.064f, 14.5603f, 9.74755f, 14.8963f, 9.11466f, 15.5684f)
        lineTo(5.47691f, 19.4316f)
        curveTo(4.84402f, 20.1037f, 4.52757f, 20.4397f, 4.65145f, 20.7199f)
        curveTo(4.77533f, 21f, 5.24038f, 21f, 6.17048f, 21f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        lineTo(6.10557f, 4.30527f)
        curveTo(6.49585f, 3.43509f, 6.69098f, 3f, 7f, 3f)
        curveTo(7.30902f, 3f, 7.50415f, 3.43509f, 7.89443f, 4.30527f)
        lineTo(10f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 20f)
        verticalLineTo(4f)
        moveTo(17.5f, 20f)
        curveTo(16.7998f, 20f, 15.4915f, 18.0057f, 15f, 17.5f)
        moveTo(17.5f, 20f)
        curveTo(18.2002f, 20f, 19.5085f, 18.0057f, 20f, 17.5f)
        }
        }.build()

        return _arrangeByLettersAZ!!
    }

private var _arrangeByLettersAZ: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NThRoot: ImageVector
    get() {
        if (_nThRoot != null) {
            return _nThRoot!!
        }
        _nThRoot = ImageVector.Builder(
            name = "NThRoot",
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
        moveTo(22f, 7f)
        horizontalLineTo(13.6138f)
        curveTo(12.3798f, 7f, 11.965f, 7.1398f, 11.659f, 8.36394f)
        lineTo(9.33913f, 17.6416f)
        curveTo(8.78948f, 19.8398f, 8.51466f, 20.9389f, 7.78481f, 20.9976f)
        curveTo(7.05496f, 21.0564f, 6.55032f, 20.02f, 5.54104f, 17.9472f)
        lineTo(4.97014f, 16.7748f)
        curveTo(4.53541f, 15.882f, 4.31804f, 15.4356f, 3.87855f, 15.3147f)
        curveTo(3.21709f, 15.1327f, 2.5084f, 15.6703f, 2f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        verticalLineTo(5.57143f)
        moveTo(3f, 5.57143f)
        curveTo(3f, 4.15127f, 4.11929f, 3f, 5.5f, 3f)
        curveTo(6.88071f, 3f, 8f, 4.15127f, 8f, 5.57143f)
        verticalLineTo(9f)
        moveTo(3f, 5.57143f)
        verticalLineTo(3f)
        }
        }.build()

        return _nThRoot!!
    }

private var _nThRoot: ImageVector? = null

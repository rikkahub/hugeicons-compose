package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuillWrite01: ImageVector
    get() {
        if (_quillWrite01 != null) {
            return _quillWrite01!!
        }
        _quillWrite01 = ImageVector.Builder(
            name = "QuillWrite01",
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
        moveTo(5.07579f, 17f)
        curveTo(4.08939f, 4.54502f, 12.9123f, 1.0121f, 19.9734f, 2.22417f)
        curveTo(20.2585f, 6.35185f, 18.2389f, 7.89748f, 14.3926f, 8.61125f)
        curveTo(15.1353f, 9.38731f, 16.4477f, 10.3639f, 16.3061f, 11.5847f)
        curveTo(16.2054f, 12.4534f, 15.6154f, 12.8797f, 14.4355f, 13.7322f)
        curveTo(11.8497f, 15.6004f, 8.85421f, 16.7785f, 5.07579f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        curveTo(4f, 15.5f, 7.84848f, 12.1818f, 10.5f, 10f)
        }
        }.build()

        return _quillWrite01!!
    }

private var _quillWrite01: ImageVector? = null

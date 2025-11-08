package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TypeCursor: ImageVector
    get() {
        if (_typeCursor != null) {
            return _typeCursor!!
        }
        _typeCursor = ImageVector.Builder(
            name = "TypeCursor",
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
        moveTo(6f, 16f)
        curveTo(5.07003f, 16f, 4.60504f, 16f, 4.22354f, 15.8978f)
        curveTo(3.18827f, 15.6204f, 2.37962f, 14.8117f, 2.10222f, 13.7765f)
        curveTo(2f, 13.395f, 2f, 12.93f, 2f, 12f)
        curveTo(2f, 11.07f, 2f, 10.605f, 2.10222f, 10.2235f)
        curveTo(2.37962f, 9.18827f, 3.18827f, 8.37962f, 4.22354f, 8.10222f)
        curveTo(4.60504f, 8f, 5.07003f, 8f, 6f, 8f)
        moveTo(12f, 16f)
        horizontalLineTo(18f)
        curveTo(18.93f, 16f, 19.395f, 16f, 19.7765f, 15.8978f)
        curveTo(20.8117f, 15.6204f, 21.6204f, 14.8117f, 21.8978f, 13.7765f)
        curveTo(22f, 13.395f, 22f, 12.93f, 22f, 12f)
        curveTo(22f, 11.07f, 22f, 10.605f, 21.8978f, 10.2235f)
        curveTo(21.6204f, 9.18827f, 20.8117f, 8.37962f, 19.7765f, 8.10222f)
        curveTo(19.395f, 8f, 18.93f, 8f, 18f, 8f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 3f)
        horizontalLineTo(9f)
        moveTo(11f, 3f)
        horizontalLineTo(9f)
        moveTo(9f, 3f)
        verticalLineTo(21f)
        moveTo(9f, 21f)
        horizontalLineTo(7f)
        moveTo(9f, 21f)
        horizontalLineTo(11f)
        }
        }.build()

        return _typeCursor!!
    }

private var _typeCursor: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tan: ImageVector
    get() {
        if (_tan != null) {
            return _tan!!
        }
        _tan = ImageVector.Builder(
            name = "Tan",
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
        moveTo(8.5f, 17f)
        lineTo(9.7f, 13f)
        moveTo(14.5f, 17f)
        lineTo(13.3f, 13f)
        moveTo(9.7f, 13f)
        lineTo(11.5f, 7f)
        lineTo(13.3f, 13f)
        moveTo(9.7f, 13f)
        horizontalLineTo(13.3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        verticalLineTo(17f)
        lineTo(17f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(4.5f)
        moveTo(7f, 7f)
        horizontalLineTo(4.5f)
        moveTo(4.5f, 17f)
        verticalLineTo(7f)
        }
        }.build()

        return _tan!!
    }

private var _tan: ImageVector? = null

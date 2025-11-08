package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LanguageSquare: ImageVector
    get() {
        if (_languageSquare != null) {
            return _languageSquare!!
        }
        _languageSquare = ImageVector.Builder(
            name = "LanguageSquare",
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
        moveTo(7f, 8.37931f)
        horizontalLineTo(11.5f)
        moveTo(17f, 8.37931f)
        horizontalLineTo(14.5f)
        moveTo(11.5f, 8.37931f)
        horizontalLineTo(14.5f)
        moveTo(11.5f, 8.37931f)
        verticalLineTo(7f)
        moveTo(14.5f, 8.37931f)
        curveTo(13.9725f, 10.2656f, 12.8679f, 12.0487f, 11.6071f, 13.6158f)
        moveTo(8.39286f, 17f)
        curveTo(9.41205f, 16.0628f, 10.5631f, 14.9134f, 11.6071f, 13.6158f)
        moveTo(11.6071f, 13.6158f)
        curveTo(10.9643f, 12.8621f, 10.0643f, 11.6426f, 9.80714f, 11.0909f)
        moveTo(11.6071f, 13.6158f)
        lineTo(13.5357f, 15.6207f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _languageSquare!!
    }

private var _languageSquare: ImageVector? = null

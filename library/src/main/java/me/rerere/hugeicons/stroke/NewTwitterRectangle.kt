package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NewTwitterRectangle: ImageVector
    get() {
        if (_newTwitterRectangle != null) {
            return _newTwitterRectangle!!
        }
        _newTwitterRectangle = ImageVector.Builder(
            name = "NewTwitterRectangle",
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
        moveTo(2.50012f, 12f)
        curveTo(2.50012f, 7.52166f, 2.50012f, 5.28249f, 3.89136f, 3.89124f)
        curveTo(5.28261f, 2.5f, 7.52178f, 2.5f, 12.0001f, 2.5f)
        curveTo(16.4785f, 2.5f, 18.7176f, 2.5f, 20.1089f, 3.89124f)
        curveTo(21.5001f, 5.28249f, 21.5001f, 7.52166f, 21.5001f, 12f)
        curveTo(21.5001f, 16.4783f, 21.5001f, 18.7175f, 20.1089f, 20.1088f)
        curveTo(18.7176f, 21.5f, 16.4785f, 21.5f, 12.0001f, 21.5f)
        curveTo(7.52178f, 21.5f, 5.28261f, 21.5f, 3.89136f, 20.1088f)
        curveTo(2.50012f, 18.7175f, 2.50012f, 16.4783f, 2.50012f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00012f, 17f)
        lineTo(11.1937f, 12.8065f)
        moveTo(17.0001f, 7f)
        lineTo(12.8066f, 11.1935f)
        moveTo(12.8066f, 11.1935f)
        lineTo(9.7779f, 7f)
        horizontalLineTo(7.00012f)
        lineTo(11.1937f, 12.8065f)
        moveTo(12.8066f, 11.1935f)
        lineTo(17.0001f, 17f)
        horizontalLineTo(14.2223f)
        lineTo(11.1937f, 12.8065f)
        }
        }.build()

        return _newTwitterRectangle!!
    }

private var _newTwitterRectangle: ImageVector? = null

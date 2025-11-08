package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NewTwitterEllipse: ImageVector
    get() {
        if (_newTwitterEllipse != null) {
            return _newTwitterEllipse!!
        }
        _newTwitterEllipse = ImageVector.Builder(
            name = "NewTwitterEllipse",
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
        moveTo(7f, 17f)
        lineTo(11.1935f, 12.8065f)
        moveTo(17f, 7f)
        lineTo(12.8065f, 11.1935f)
        moveTo(12.8065f, 11.1935f)
        lineTo(9.77778f, 7f)
        horizontalLineTo(7f)
        lineTo(11.1935f, 12.8065f)
        moveTo(12.8065f, 11.1935f)
        lineTo(17f, 17f)
        horizontalLineTo(14.2222f)
        lineTo(11.1935f, 12.8065f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }
        }.build()

        return _newTwitterEllipse!!
    }

private var _newTwitterEllipse: ImageVector? = null

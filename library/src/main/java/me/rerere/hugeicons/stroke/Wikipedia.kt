package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wikipedia: ImageVector
    get() {
        if (_wikipedia != null) {
            return _wikipedia!!
        }
        _wikipedia = ImageVector.Builder(
            name = "Wikipedia",
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 8f)
        horizontalLineTo(6.05f)
        moveTo(6.05f, 8f)
        horizontalLineTo(7f)
        moveTo(6.05f, 8f)
        lineTo(8.62731f, 14.8207f)
        curveTo(9.17631f, 16.2736f, 9.45081f, 17f, 9.9f, 17f)
        curveTo(10.3492f, 17f, 10.6237f, 16.2736f, 11.1727f, 14.8207f)
        lineTo(13.75f, 8f)
        horizontalLineTo(14.5f)
        moveTo(9.5f, 8f)
        horizontalLineTo(10.25f)
        lineTo(12.8273f, 14.8207f)
        curveTo(13.3763f, 16.2736f, 13.6508f, 17f, 14.1f, 17f)
        curveTo(14.5492f, 17f, 14.8237f, 16.2736f, 15.3727f, 14.8207f)
        lineTo(17.95f, 8f)
        moveTo(17.95f, 8f)
        horizontalLineTo(17f)
        moveTo(17.95f, 8f)
        horizontalLineTo(19f)
        }
        }.build()

        return _wikipedia!!
    }

private var _wikipedia: ImageVector? = null

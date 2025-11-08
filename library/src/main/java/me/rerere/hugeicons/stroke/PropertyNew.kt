package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PropertyNew: ImageVector
    get() {
        if (_propertyNew != null) {
            return _propertyNew!!
        }
        _propertyNew = ImageVector.Builder(
            name = "PropertyNew",
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
        moveTo(2.50014f, 11.9999f)
        curveTo(2.50014f, 7.52157f, 2.50014f, 5.28239f, 3.89138f, 3.89115f)
        curveTo(5.28263f, 2.49991f, 7.5218f, 2.49991f, 12.0001f, 2.49991f)
        curveTo(16.4785f, 2.49991f, 18.7177f, 2.49991f, 20.1089f, 3.89115f)
        curveTo(21.5001f, 5.28239f, 21.5001f, 7.52157f, 21.5001f, 11.9999f)
        curveTo(21.5001f, 16.4783f, 21.5001f, 18.7174f, 20.1089f, 20.1087f)
        curveTo(18.7177f, 21.4999f, 16.4785f, 21.4999f, 12.0001f, 21.4999f)
        curveTo(7.5218f, 21.4999f, 5.28263f, 21.4999f, 3.89138f, 20.1087f)
        curveTo(2.50014f, 18.7174f, 2.50014f, 16.4783f, 2.50014f, 11.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 8f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 17f)
        horizontalLineTo(17f)
        moveTo(7f, 17f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 13f)
        horizontalLineTo(17f)
        moveTo(7f, 13f)
        horizontalLineTo(8f)
        }
        }.build()

        return _propertyNew!!
    }

private var _propertyNew: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Focus: ImageVector
    get() {
        if (_focus != null) {
            return _focus!!
        }
        _focus = ImageVector.Builder(
            name = "Focus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 7.73735f)
            curveTo(20.9133f, 5.98847f, 20.654f, 4.89808f, 19.8783f, 4.12242f)
            curveTo(19.1026f, 3.34675f, 18.0121f, 3.08746f, 16.2632f, 3.00079f)
            moveTo(3f, 7.73656f)
            curveTo(3.08668f, 5.98769f, 3.34598f, 4.8973f, 4.1217f, 4.12163f)
            curveTo(4.89741f, 3.34596f, 5.98786f, 3.08667f, 7.73684f, 3f)
            moveTo(21f, 16.2627f)
            curveTo(20.9133f, 18.0115f, 20.654f, 19.1019f, 19.8783f, 19.8776f)
            curveTo(19.1026f, 20.6533f, 18.0121f, 20.9125f, 16.2632f, 20.9992f)
            moveTo(3f, 16.2634f)
            curveTo(3.08668f, 18.0123f, 3.34598f, 19.1027f, 4.1217f, 19.8784f)
            curveTo(4.89741f, 20.654f, 5.98786f, 20.9133f, 7.73684f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 9f)
            verticalLineTo(15f)
            moveTo(15f, 11.9941f)
            lineTo(9f, 11.9941f)
        }
        }.build()

        return _focus!!
    }

private var _focus: ImageVector? = null

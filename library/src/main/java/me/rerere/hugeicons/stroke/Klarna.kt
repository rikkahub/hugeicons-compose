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

val HugeIcons.Klarna: ImageVector
    get() {
        if (_klarna != null) {
            return _klarna!!
        }
        _klarna = ImageVector.Builder(
            name = "Klarna",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 18.5f)
            arcTo(2f, 2f, 0f, true, false, 18f, 18.5f)
            arcTo(2f, 2f, 0f, true, false, 22f, 18.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 3.5f)
            horizontalLineTo(6f)
            verticalLineTo(20.5f)
            horizontalLineTo(2f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 3.5f)
            horizontalLineTo(11.1985f)
            curveTo(11.1985f, 9.8463f, 6f, 12.5f, 6f, 12.5f)
            lineTo(11.8931f, 20.5f)
            horizontalLineTo(16.5f)
            lineTo(11f, 13f)
            curveTo(11f, 13f, 15f, 10f, 15f, 3.5f)
            close()
        }
        }.build()

        return _klarna!!
    }

private var _klarna: ImageVector? = null

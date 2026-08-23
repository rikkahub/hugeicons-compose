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

val HugeIcons.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = ImageVector.Builder(
            name = "Bold",
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
            moveTo(13f, 4f)
            horizontalLineTo(10f)
            curveTo(8.11438f, 4f, 7.17157f, 4f, 6.58579f, 4.58579f)
            curveTo(6f, 5.17157f, 6f, 6.11438f, 6f, 8f)
            verticalLineTo(12f)
            horizontalLineTo(13f)
            curveTo(15.2091f, 12f, 17f, 10.2091f, 17f, 8f)
            curveTo(17f, 5.79086f, 15.2091f, 4f, 13f, 4f)
            close()
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
            moveTo(14f, 12f)
            horizontalLineTo(6f)
            verticalLineTo(16f)
            curveTo(6f, 17.8856f, 6f, 18.8284f, 6.58579f, 19.4142f)
            curveTo(7.17157f, 20f, 8.11438f, 20f, 10f, 20f)
            horizontalLineTo(14f)
            curveTo(16.2091f, 20f, 18f, 18.2091f, 18f, 16f)
            curveTo(18f, 13.7909f, 16.2091f, 12f, 14f, 12f)
            close()
        }
        }.build()

        return _bold!!
    }

private var _bold: ImageVector? = null

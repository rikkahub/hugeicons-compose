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

val HugeIcons.Reload: ImageVector
    get() {
        if (_reload != null) {
            return _reload!!
        }
        _reload = ImageVector.Builder(
            name = "Reload",
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
            moveTo(16.5f, 7.99976f)
            horizontalLineTo(18f)
            curveTo(19.4142f, 7.99976f, 20.1213f, 7.99976f, 20.5607f, 7.56042f)
            curveTo(21f, 7.12108f, 21f, 6.41397f, 21f, 4.99976f)
            verticalLineTo(3.49976f)
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
            moveTo(3f, 11.9998f)
            curveTo(3f, 7.02919f, 7.0293f, 2.99976f, 12f, 2.99976f)
            curveTo(15.571f, 2.99976f, 18.0948f, 4.73029f, 20f, 7.08347f)
            moveTo(21f, 11.9998f)
            curveTo(21f, 16.9703f, 16.9707f, 20.9998f, 12f, 20.9998f)
            curveTo(8.42904f, 20.9998f, 5.90524f, 19.2692f, 4f, 16.916f)
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
            moveTo(7.5f, 15.9998f)
            horizontalLineTo(6f)
            curveTo(4.58579f, 15.9998f, 3.87868f, 15.9998f, 3.43934f, 16.4391f)
            curveTo(3f, 16.8784f, 3f, 17.5855f, 3f, 18.9998f)
            verticalLineTo(20.4998f)
        }
        }.build()

        return _reload!!
    }

private var _reload: ImageVector? = null

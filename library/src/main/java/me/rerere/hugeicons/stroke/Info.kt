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

val HugeIcons.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = ImageVector.Builder(
            name = "Info",
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
            moveTo(22f, 11.9999f)
            arcTo(10f, 10f, 0f, true, false, 2f, 11.9999f)
            arcTo(10f, 10f, 0f, true, false, 22f, 11.9999f)
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
            moveTo(12f, 15.9999f)
            lineTo(12f, 11.9999f)
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
            moveTo(11.875f, 8.24994f)
            lineTo(12f, 8.24994f)
            moveTo(11.75f, 8.24994f)
            curveTo(11.75f, 8.11187f, 11.8619f, 7.99994f, 12f, 7.99994f)
            curveTo(12.1381f, 7.99994f, 12.25f, 8.11187f, 12.25f, 8.24994f)
            curveTo(12.25f, 8.38801f, 12.1381f, 8.49994f, 12f, 8.49994f)
            curveTo(11.8619f, 8.49994f, 11.75f, 8.38801f, 11.75f, 8.24994f)
            close()
        }
        }.build()

        return _info!!
    }

private var _info: ImageVector? = null

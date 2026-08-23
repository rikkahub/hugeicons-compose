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

val HugeIcons.NotepadTextDashed: ImageVector
    get() {
        if (_notepadTextDashed != null) {
            return _notepadTextDashed!!
        }
        _notepadTextDashed = ImageVector.Builder(
            name = "NotepadTextDashed",
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
            moveTo(13f, 22.0005f)
            horizontalLineTo(11f)
            moveTo(16.5f, 3.58926f)
            curveTo(17.6376f, 3.70116f, 18.4033f, 3.95405f, 18.9749f, 4.52558f)
            curveTo(19.6998f, 5.25055f, 19.9121f, 6.28798f, 19.9743f, 8.00046f)
            moveTo(7.5f, 3.58926f)
            curveTo(6.3624f, 3.70116f, 5.59666f, 3.95405f, 5.02513f, 4.52558f)
            curveTo(4.30016f, 5.25055f, 4.08789f, 6.28798f, 4.02573f, 8.00046f)
            moveTo(20f, 12.0005f)
            verticalLineTo(14.0005f)
            moveTo(4f, 12.0005f)
            verticalLineTo(14.0005f)
            moveTo(19.9504f, 18.0005f)
            curveTo(19.8638f, 19.4199f, 19.6264f, 20.3238f, 18.9749f, 20.9753f)
            curveTo(18.4914f, 21.4588f, 17.869f, 21.7143f, 17f, 21.8492f)
            moveTo(4.04962f, 18.0005f)
            curveTo(4.13616f, 19.4199f, 4.3736f, 20.3238f, 5.02513f, 20.9753f)
            curveTo(5.5086f, 21.4588f, 6.13105f, 21.7143f, 7f, 21.8492f)
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
            moveTo(16.5f, 2.00046f)
            verticalLineTo(5.00046f)
            moveTo(7.5f, 2.00046f)
            verticalLineTo(5.00046f)
            moveTo(12f, 2.00046f)
            verticalLineTo(5.00046f)
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
            moveTo(8f, 15.0005f)
            horizontalLineTo(12f)
            moveTo(8f, 11.0005f)
            horizontalLineTo(16f)
        }
        }.build()

        return _notepadTextDashed!!
    }

private var _notepadTextDashed: ImageVector? = null

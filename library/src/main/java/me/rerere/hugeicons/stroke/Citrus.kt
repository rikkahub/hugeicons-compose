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

val HugeIcons.Citrus: ImageVector
    get() {
        if (_citrus != null) {
            return _citrus!!
        }
        _citrus = ImageVector.Builder(
            name = "Citrus",
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
            moveTo(8.93718f, 5.16602f)
            curveTo(6.31712f, 7.90764f, 6.35481f, 12.2544f, 9.05025f, 14.9499f)
            curveTo(11.7457f, 17.6453f, 16.0925f, 17.683f, 18.8341f, 15.0629f)
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
            moveTo(14f, 10f)
            lineTo(9.5f, 14.5f)
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
            moveTo(14f, 17f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
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
            moveTo(6.26567f, 17.7343f)
            curveTo(9.54361f, 21.0123f, 14.3548f, 21.8225f, 18.3907f, 20.1651f)
            curveTo(19.9481f, 19.5255f, 20.7269f, 19.2057f, 20.9588f, 18.0486f)
            curveTo(21.1908f, 16.8914f, 20.4329f, 16.1335f, 18.9169f, 14.6175f)
            lineTo(9.38247f, 5.08306f)
            curveTo(7.86654f, 3.56713f, 7.10858f, 2.80917f, 5.95145f, 3.04116f)
            curveTo(4.79431f, 3.27315f, 4.47451f, 4.05187f, 3.83491f, 5.60933f)
            curveTo(2.17749f, 9.64524f, 2.98774f, 14.4564f, 6.26567f, 17.7343f)
            close()
        }
        }.build()

        return _citrus!!
    }

private var _citrus: ImageVector? = null

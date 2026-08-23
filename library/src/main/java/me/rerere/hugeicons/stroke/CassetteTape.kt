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

val HugeIcons.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) {
            return _cassetteTape!!
        }
        _cassetteTape = ImageVector.Builder(
            name = "CassetteTape",
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
            moveTo(15f, 20f)
            horizontalLineTo(9f)
            curveTo(5.70017f, 20f, 4.05025f, 20f, 3.02513f, 18.9749f)
            curveTo(2f, 17.9497f, 2f, 16.2998f, 2f, 13f)
            verticalLineTo(11f)
            curveTo(2f, 7.70017f, 2f, 6.05025f, 3.02513f, 5.02513f)
            curveTo(4.05025f, 4f, 5.70017f, 4f, 9f, 4f)
            horizontalLineTo(15f)
            curveTo(18.2998f, 4f, 19.9497f, 4f, 20.9749f, 5.02513f)
            curveTo(22f, 6.05025f, 22f, 7.70017f, 22f, 11f)
            verticalLineTo(13f)
            curveTo(22f, 16.2998f, 22f, 17.9497f, 20.9749f, 18.9749f)
            curveTo(19.9497f, 20f, 18.2998f, 20f, 15f, 20f)
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
            moveTo(6.0459f, 19.8164f)
            lineTo(6.24254f, 19.0299f)
            curveTo(6.60632f, 17.5747f, 6.78821f, 16.8472f, 7.33073f, 16.4236f)
            curveTo(7.87326f, 16f, 8.62321f, 16f, 10.1231f, 16f)
            horizontalLineTo(13.8769f)
            curveTo(15.3768f, 16f, 16.1268f, 16f, 16.6693f, 16.4236f)
            curveTo(17.2118f, 16.8472f, 17.3937f, 17.5747f, 17.7575f, 19.0299f)
            lineTo(17.9541f, 19.8164f)
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
            moveTo(10f, 10f)
            arcTo(2f, 2f, 0f, true, false, 6f, 10f)
            arcTo(2f, 2f, 0f, true, false, 10f, 10f)
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
            moveTo(18f, 10f)
            arcTo(2f, 2f, 0f, true, false, 14f, 10f)
            arcTo(2f, 2f, 0f, true, false, 18f, 10f)
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
            moveTo(8f, 12f)
            horizontalLineTo(16f)
            moveTo(8f, 8f)
            horizontalLineTo(16f)
        }
        }.build()

        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null

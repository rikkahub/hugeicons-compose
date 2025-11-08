package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CustomField: ImageVector
    get() {
        if (_customField != null) {
            return _customField!!
        }
        _customField = ImageVector.Builder(
            name = "CustomField",
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
        moveTo(2f, 12f)
        curveTo(2f, 9.19108f, 2f, 7.78661f, 2.67412f, 6.77772f)
        curveTo(2.96596f, 6.34096f, 3.34096f, 5.96596f, 3.77772f, 5.67412f)
        curveTo(4.78661f, 5f, 6.19108f, 5f, 9f, 5f)
        horizontalLineTo(15f)
        curveTo(17.8089f, 5f, 19.2134f, 5f, 20.2223f, 5.67412f)
        curveTo(20.659f, 5.96596f, 21.034f, 6.34096f, 21.3259f, 6.77772f)
        curveTo(22f, 7.78661f, 22f, 9.19108f, 22f, 12f)
        curveTo(22f, 14.8089f, 22f, 16.2134f, 21.3259f, 17.2223f)
        curveTo(21.034f, 17.659f, 20.659f, 18.034f, 20.2223f, 18.3259f)
        curveTo(19.2134f, 19f, 17.8089f, 19f, 15f, 19f)
        horizontalLineTo(9f)
        curveTo(6.19108f, 19f, 4.78661f, 19f, 3.77772f, 18.3259f)
        curveTo(3.34096f, 18.034f, 2.96596f, 17.659f, 2.67412f, 17.2223f)
        curveTo(2f, 16.2134f, 2f, 14.8089f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10.5417f)
        lineTo(14.5858f, 9.9722f)
        curveTo(15.2525f, 9.32407f, 15.5858f, 9f, 16f, 9f)
        curveTo(16.4142f, 9f, 16.7475f, 9.32407f, 17.4142f, 9.9722f)
        lineTo(18f, 10.5417f)
        moveTo(14f, 13.4583f)
        lineTo(14.5858f, 14.0278f)
        curveTo(15.2525f, 14.6759f, 15.5858f, 15f, 16f, 15f)
        curveTo(16.4142f, 15f, 16.7475f, 14.6759f, 17.4142f, 14.0278f)
        lineTo(18f, 13.4583f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        lineTo(10f, 12f)
        }
        }.build()

        return _customField!!
    }

private var _customField: ImageVector? = null

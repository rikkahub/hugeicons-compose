package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Video01: ImageVector
    get() {
        if (_video01 != null) {
            return _video01!!
        }
        _video01 = ImageVector.Builder(
            name = "Video01",
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
        moveTo(2f, 11f)
        curveTo(2f, 7.70017f, 2f, 6.05025f, 3.02513f, 5.02513f)
        curveTo(4.05025f, 4f, 5.70017f, 4f, 9f, 4f)
        horizontalLineTo(10f)
        curveTo(13.2998f, 4f, 14.9497f, 4f, 15.9749f, 5.02513f)
        curveTo(17f, 6.05025f, 17f, 7.70017f, 17f, 11f)
        verticalLineTo(13f)
        curveTo(17f, 16.2998f, 17f, 17.9497f, 15.9749f, 18.9749f)
        curveTo(14.9497f, 20f, 13.2998f, 20f, 10f, 20f)
        horizontalLineTo(9f)
        curveTo(5.70017f, 20f, 4.05025f, 20f, 3.02513f, 18.9749f)
        curveTo(2f, 17.9497f, 2f, 16.2998f, 2f, 13f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8.90585f)
        lineTo(17.1259f, 8.80196f)
        curveTo(19.2417f, 7.05623f, 20.2996f, 6.18336f, 21.1498f, 6.60482f)
        curveTo(22f, 7.02628f, 22f, 8.42355f, 22f, 11.2181f)
        verticalLineTo(12.7819f)
        curveTo(22f, 15.5765f, 22f, 16.9737f, 21.1498f, 17.3952f)
        curveTo(20.2996f, 17.8166f, 19.2417f, 16.9438f, 17.1259f, 15.198f)
        lineTo(17f, 15.0941f)
        }
        }.build()

        return _video01!!
    }

private var _video01: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Repair: ImageVector
    get() {
        if (_repair != null) {
            return _repair!!
        }
        _repair = ImageVector.Builder(
            name = "Repair",
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
        moveTo(11f, 11f)
        lineTo(6f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 7.5f)
        lineTo(7.5f, 5f)
        lineTo(4.5f, 3.5f)
        lineTo(3.5f, 4.5f)
        lineTo(5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9749f, 8.97487f)
        curveTo(20.9858f, 7.96391f, 21.2491f, 6.48836f, 20.7645f, 5.23548f)
        lineTo(19.3425f, 6.65748f)
        horizontalLineTo(17.3425f)
        verticalLineTo(4.65748f)
        lineTo(18.7645f, 3.23548f)
        curveTo(17.5116f, 2.75095f, 16.0361f, 3.01416f, 15.0251f, 4.02513f)
        curveTo(14.0138f, 5.03647f, 13.7507f, 6.51274f, 14.236f, 7.76593f)
        lineTo(7.76593f, 14.236f)
        curveTo(6.51275f, 13.7507f, 5.03647f, 14.0138f, 4.02513f, 15.0251f)
        curveTo(3.01416f, 16.0361f, 2.75095f, 17.5116f, 3.23548f, 18.7645f)
        lineTo(4.65748f, 17.3425f)
        lineTo(6.65748f, 17.3425f)
        lineTo(6.65748f, 19.3425f)
        lineTo(5.23548f, 20.7645f)
        curveTo(6.48836f, 21.2491f, 7.96391f, 20.9858f, 8.97487f, 19.9749f)
        curveTo(9.98546f, 18.9643f, 10.2489f, 17.4895f, 9.76507f, 16.2369f)
        lineTo(16.2369f, 9.76507f)
        curveTo(17.4895f, 10.2489f, 18.9643f, 9.98546f, 19.9749f, 8.97487f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.797f, 14.5f)
        lineTo(17.401f, 20.1041f)
        curveTo(17.9288f, 20.6319f, 18.7846f, 20.6319f, 19.3124f, 20.1041f)
        lineTo(20.1041f, 19.3124f)
        curveTo(20.632f, 18.7845f, 20.632f, 17.9288f, 20.1041f, 17.401f)
        lineTo(14.5001f, 11.7969f)
        }
        }.build()

        return _repair!!
    }

private var _repair: ImageVector? = null

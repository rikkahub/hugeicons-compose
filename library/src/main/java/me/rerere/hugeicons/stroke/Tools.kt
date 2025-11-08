package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = ImageVector.Builder(
            name = "Tools",
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
        moveTo(13f, 11f)
        lineTo(18f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 7f)
        lineTo(17f, 5f)
        lineTo(19.5f, 3.5f)
        lineTo(20.5f, 4.5f)
        lineTo(19f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.02513f, 8.97487f)
        curveTo(3.01416f, 7.96391f, 2.75095f, 6.48836f, 3.23548f, 5.23548f)
        lineTo(4.65748f, 6.65748f)
        horizontalLineTo(6.65748f)
        verticalLineTo(4.65748f)
        lineTo(5.23548f, 3.23548f)
        curveTo(6.48836f, 2.75095f, 7.96391f, 3.01416f, 8.97487f, 4.02513f)
        curveTo(9.98621f, 5.03647f, 10.2493f, 6.51274f, 9.76398f, 7.76593f)
        lineTo(16.2341f, 14.236f)
        curveTo(17.4873f, 13.7507f, 18.9635f, 14.0138f, 19.9749f, 15.0251f)
        curveTo(20.9858f, 16.0361f, 21.2491f, 17.5116f, 20.7645f, 18.7645f)
        lineTo(19.3425f, 17.3425f)
        lineTo(17.3425f, 17.3425f)
        verticalLineTo(19.3425f)
        lineTo(18.7645f, 20.7645f)
        curveTo(17.5116f, 21.2491f, 16.0361f, 20.9858f, 15.0251f, 19.9749f)
        curveTo(14.0145f, 18.9643f, 13.7511f, 17.4895f, 14.2349f, 16.2369f)
        lineTo(7.76312f, 9.76507f)
        curveTo(6.51053f, 10.2489f, 5.03571f, 9.98546f, 4.02513f, 8.97487f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.203f, 14.5f)
        lineTo(6.59897f, 20.1041f)
        curveTo(6.07115f, 20.6319f, 5.2154f, 20.6319f, 4.68758f, 20.1041f)
        lineTo(3.89586f, 19.3124f)
        curveTo(3.36805f, 18.7846f, 3.36805f, 17.9288f, 3.89586f, 17.401f)
        lineTo(9.49994f, 11.7969f)
        }
        }.build()

        return _tools!!
    }

private var _tools: ImageVector? = null

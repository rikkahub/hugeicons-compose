package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Submarine: ImageVector
    get() {
        if (_submarine != null) {
            return _submarine!!
        }
        _submarine = ImageVector.Builder(
            name = "Submarine",
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
        moveTo(19f, 12f)
        horizontalLineTo(9.64103f)
        curveTo(8.665f, 12f, 7.68502f, 12.85f, 6.87882f, 13.3085f)
        curveTo(6.53595f, 13.5035f, 6.36451f, 13.601f, 6.20707f, 13.5706f)
        curveTo(6.04963f, 13.5401f, 5.88565f, 13.35f, 5.55769f, 12.9698f)
        curveTo(4.87109f, 12.1737f, 4.12853f, 12f, 3f, 12f)
        curveTo(2.44772f, 12f, 2f, 12.5223f, 2f, 13.1667f)
        verticalLineTo(17.8333f)
        curveTo(2f, 18.4777f, 2.44772f, 19f, 3f, 19f)
        curveTo(4.12854f, 19f, 4.87109f, 18.8263f, 5.55769f, 18.0302f)
        curveTo(5.88565f, 17.65f, 6.04963f, 17.4599f, 6.20707f, 17.4294f)
        curveTo(6.36451f, 17.399f, 6.53595f, 17.4965f, 6.87882f, 17.6915f)
        curveTo(7.68502f, 18.15f, 8.665f, 19f, 9.64102f, 19f)
        horizontalLineTo(19f)
        curveTo(20.6569f, 19f, 22f, 17.433f, 22f, 15.5f)
        curveTo(22f, 13.567f, 20.6569f, 12f, 19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 12f)
        lineTo(11.0594f, 10.7635f)
        curveTo(11.4467f, 9.90726f, 11.6404f, 9.47914f, 12.0117f, 9.23957f)
        curveTo(12.383f, 9f, 12.8529f, 9f, 13.7927f, 9f)
        horizontalLineTo(14.2073f)
        curveTo(15.1471f, 9f, 15.617f, 9f, 15.9883f, 9.23957f)
        curveTo(16.3596f, 9.47914f, 16.5533f, 9.90726f, 16.9406f, 10.7635f)
        lineTo(17.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        verticalLineTo(5f)
        curveTo(14f, 4.44772f, 14.4477f, 4f, 15f, 4f)
        horizontalLineTo(16f)
        }
        }.build()

        return _submarine!!
    }

private var _submarine: ImageVector? = null

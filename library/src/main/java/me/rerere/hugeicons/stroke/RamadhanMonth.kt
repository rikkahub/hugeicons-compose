package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RamadhanMonth: ImageVector
    get() {
        if (_ramadhanMonth != null) {
            return _ramadhanMonth!!
        }
        _ramadhanMonth = ImageVector.Builder(
            name = "RamadhanMonth",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 2f)
        verticalLineTo(4f)
        moveTo(6.5f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12.2432f)
        curveTo(3f, 7.88594f, 3f, 5.70728f, 4.25212f, 4.35364f)
        curveTo(5.50424f, 3f, 7.51949f, 3f, 11.55f, 3f)
        horizontalLineTo(13.45f)
        curveTo(17.4805f, 3f, 19.4958f, 3f, 20.7479f, 4.35364f)
        curveTo(22f, 5.70728f, 22f, 7.88594f, 22f, 12.2432f)
        verticalLineTo(12.7568f)
        curveTo(22f, 17.1141f, 22f, 19.2927f, 20.7479f, 20.6464f)
        curveTo(19.4958f, 22f, 17.4805f, 22f, 13.45f, 22f)
        horizontalLineTo(11.55f)
        curveTo(7.51949f, 22f, 5.50424f, 22f, 4.25212f, 20.6464f)
        curveTo(3f, 19.2927f, 3f, 17.1141f, 3f, 12.7568f)
        verticalLineTo(12.2432f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 8f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 16.4343f)
        curveTo(14.9347f, 17.3725f, 13.906f, 18f, 12.7308f, 18f)
        curveTo(10.9465f, 18f, 9.5f, 16.5535f, 9.5f, 14.7692f)
        curveTo(9.5f, 13.594f, 10.1275f, 12.5653f, 11.0657f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13f)
        horizontalLineTo(14.509f)
        }
        }.build()

        return _ramadhanMonth!!
    }

private var _ramadhanMonth: ImageVector? = null

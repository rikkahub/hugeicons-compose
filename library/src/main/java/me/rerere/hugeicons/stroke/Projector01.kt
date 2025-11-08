package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Projector01: ImageVector
    get() {
        if (_projector01 != null) {
            return _projector01!!
        }
        _projector01 = ImageVector.Builder(
            name = "Projector01",
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
        moveTo(11.5f, 10f)
        horizontalLineTo(6.5f)
        curveTo(4.62513f, 10f, 3.6877f, 10f, 3.03054f, 10.4775f)
        curveTo(2.8183f, 10.6317f, 2.63166f, 10.8183f, 2.47746f, 11.0305f)
        curveTo(2f, 11.6877f, 2f, 12.6251f, 2f, 14.5f)
        curveTo(2f, 16.3749f, 2f, 17.3123f, 2.47746f, 17.9695f)
        curveTo(2.63166f, 18.1817f, 2.8183f, 18.3683f, 3.03054f, 18.5225f)
        curveTo(3.6877f, 19f, 4.62513f, 19f, 6.5f, 19f)
        horizontalLineTo(17.5f)
        curveTo(19.3749f, 19f, 20.3123f, 19f, 20.9695f, 18.5225f)
        curveTo(21.1817f, 18.3683f, 21.3683f, 18.1817f, 21.5225f, 17.9695f)
        curveTo(22f, 17.3123f, 22f, 16.3749f, 22f, 14.5f)
        curveTo(22f, 12.6251f, 22f, 11.6877f, 21.5225f, 11.0305f)
        curveTo(21.3683f, 10.8183f, 21.1817f, 10.6317f, 20.9695f, 10.4775f)
        curveTo(20.5172f, 10.1488f, 19.9321f, 10.0464f, 19f, 10.0145f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.49981f, 13.5f)
        horizontalLineTo(5.50879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 19f)
        lineTo(5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 19f)
        lineTo(19f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 5f)
        lineTo(11.5f, 4f)
        moveTo(19.5f, 4f)
        lineTo(18.5f, 5f)
        moveTo(15.5f, 4f)
        verticalLineTo(2f)
        }
        }.build()

        return _projector01!!
    }

private var _projector01: ImageVector? = null

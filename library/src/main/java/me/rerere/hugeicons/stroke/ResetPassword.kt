package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ResetPassword: ImageVector
    get() {
        if (_resetPassword != null) {
            return _resetPassword!!
        }
        _resetPassword = ImageVector.Builder(
            name = "ResetPassword",
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
        moveTo(21.5f, 12f)
        curveTo(21.5f, 17.2467f, 17.2467f, 21.5f, 12f, 21.5f)
        curveTo(6.75334f, 21.5f, 2.5f, 17.2467f, 2.5f, 12f)
        curveTo(2.5f, 6.75329f, 6.75334f, 2.5f, 12f, 2.5f)
        curveTo(15.8956f, 2.5f, 19.2436f, 4.84478f, 20.7095f, 8.2f)
        moveTo(21.5f, 5.5f)
        lineTo(21.025f, 8.675f)
        lineTo(18f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        verticalLineTo(9.5f)
        curveTo(10f, 8.39543f, 10.8954f, 7.5f, 12f, 7.5f)
        curveTo(13.1046f, 7.5f, 14f, 8.39543f, 14f, 9.5f)
        verticalLineTo(11f)
        moveTo(11.25f, 16.5f)
        horizontalLineTo(12.75f)
        curveTo(13.9228f, 16.5f, 14.5092f, 16.5f, 14.9131f, 16.19f)
        curveTo(15.0171f, 16.1102f, 15.1102f, 16.0171f, 15.19f, 15.9131f)
        curveTo(15.5f, 15.5092f, 15.5f, 14.9228f, 15.5f, 13.75f)
        curveTo(15.5f, 12.5772f, 15.5f, 11.9908f, 15.19f, 11.5869f)
        curveTo(15.1102f, 11.4829f, 15.0171f, 11.3898f, 14.9131f, 11.31f)
        curveTo(14.5092f, 11f, 13.9228f, 11f, 12.75f, 11f)
        horizontalLineTo(11.25f)
        curveTo(10.0772f, 11f, 9.49082f, 11f, 9.08686f, 11.31f)
        curveTo(8.98286f, 11.3898f, 8.88977f, 11.4829f, 8.80997f, 11.5869f)
        curveTo(8.5f, 11.9908f, 8.5f, 12.5772f, 8.5f, 13.75f)
        curveTo(8.5f, 14.9228f, 8.5f, 15.5092f, 8.80997f, 15.9131f)
        curveTo(8.88977f, 16.0171f, 8.98286f, 16.1102f, 9.08686f, 16.19f)
        curveTo(9.49082f, 16.5f, 10.0772f, 16.5f, 11.25f, 16.5f)
        }
        }.build()

        return _resetPassword!!
    }

private var _resetPassword: ImageVector? = null

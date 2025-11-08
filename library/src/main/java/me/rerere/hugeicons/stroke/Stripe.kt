package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stripe: ImageVector
    get() {
        if (_stripe != null) {
            return _stripe!!
        }
        _stripe = ImageVector.Builder(
            name = "Stripe",
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
        moveTo(17.25f, 4f)
        verticalLineTo(8.5f)
        curveTo(12.9921f, 6.77511f, 10.6642f, 7.08164f, 10.5482f, 8.14206f)
        curveTo(10.4322f, 9.20249f, 11.9677f, 9.82253f, 12.75f, 10f)
        curveTo(12.75f, 10f, 18.25f, 11f, 18.25f, 15.5f)
        curveTo(18.25f, 20f, 13.25f, 21f, 10.75f, 21f)
        curveTo(8.75f, 21f, 6.58333f, 20.1981f, 5.75f, 19.8648f)
        verticalLineTo(15.1633f)
        curveTo(6.54997f, 15.6189f, 8.56994f, 16.5633f, 10.25f, 16.6959f)
        curveTo(12.3501f, 16.8616f, 12.9123f, 16.3765f, 13.0543f, 15.7639f)
        curveTo(13.3132f, 14.6468f, 11.4418f, 13.9934f, 10.25f, 13.5f)
        curveTo(7.05f, 12.3f, 5.75f, 11f, 5.75f, 8.5f)
        curveTo(5.75f, 4f, 9.75f, 3f, 12.25f, 3f)
        curveTo(14.65f, 3f, 16.5833f, 3.66667f, 17.25f, 4f)
        }
        }.build()

        return _stripe!!
    }

private var _stripe: ImageVector? = null
